package cn.kgc.controller.zeng;

import cn.kgc.entity.Categories;
import cn.kgc.entity.h.Order;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.entity.ShoppingCart;
import cn.kgc.service.zeng.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/Menus")
public class MenuControllerZeng {

    @Autowired
    private MenuServiceZeng menuService;
    @Autowired
    private CateforiesServiceZeng cateforiesService;
    @Autowired
    private ShoppingCartServiceZeng shoppingCartService;
    @Autowired
    private OrderServiceZeng orderService;
    @Autowired
    private RestaurantServiceZeng restaurantServiceZeng;

    @RequestMapping("/detail")
    public String show(Model model){
        List<Categories> cateforiesList = cateforiesService.allSelect();
        model.addAttribute("cateforiesList",cateforiesList);
        return "shop_detail";
    }
    @RequestMapping("/add")
    public String add(Order order, Integer[] menuId, Integer[] quantity, Double[] unitPrice, Double[] subtotal, Model model,
                      @RequestParam(value = "restaurant",required = false)Integer restaurant){
        if (menuId != null && quantity != null && unitPrice != null && subtotal != null) {
            int length = menuId.length;
            double totalMoney = 0;
            // 插入订单，获取自增的订单ID
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            Long orderNo = Long.valueOf(sdf.format(new Date()));
            /*订单编号外部插入*/
            order.setOrderNum(orderNo);
            /*订单日期外部插入*/
            order.setOrderDate(new java.sql.Date(System.currentTimeMillis()));
            order.setRestaurantId(restaurant);

            /*订单总金额*/
            for (int i = 0; i < length; i++) {
                totalMoney += subtotal[i];
            }
            order.setTotalAmount(totalMoney);
            orderService.addOrder(order);
            for (int i = 0; i < length; i++) {
                 ShoppingCart shoppingCart = new ShoppingCart(order.getOid(),menuId[i], quantity[i], unitPrice[i], subtotal[i]);
                shoppingCartService.addShoppingCart(shoppingCart);
            }
            model.addAttribute("orderNo",orderNo);
            model.addAttribute("totalMoney",totalMoney);
        }

        return "/order_success";
    }

    @RequestMapping("/intro")
    public String showIntro(Model model,
                            @RequestParam(value = "restaurant",required = false)Integer restaurant){
        Restaurants restaurants = restaurantServiceZeng.showRestaurants(restaurant);
        model.addAttribute("restaurants",restaurants);
        return "shop_intro";
    }

}
