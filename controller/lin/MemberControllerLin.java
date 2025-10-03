package cn.kgc.controller.lin;

import cn.kgc.entity.h.Order;
import cn.kgc.service.lin.OrderServiceLin;
import cn.kgc.service.lin.RestaurantServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberControllerLin {

    @Autowired
    private OrderServiceLin orderServiceLin;

    private RestaurantServiceLin restaurantServiceLin;

    @RequestMapping("/orderList")
    public String showOrders(Integer userId, Model model) {
        List<Order> orders = orderServiceLin.getOrders(userId);
        for (Order order : orders) {
            order.setRestaurant(restaurantServiceLin.restaurantsDetail(order.getUserId()));
        }
        model.addAttribute("orders", orders);
        return "member_order";
    }
}
