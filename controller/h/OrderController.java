package cn.kgc.controller.h;

import cn.kgc.entity.h.Order;
import cn.kgc.entity.h.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.kgc.service.h.OrderDetailsService;
import cn.kgc.service.h.OrderInfoService;
import cn.kgc.service.h.OrderService;
import cn.kgc.util.PageBean;


import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/order2")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private OrderInfoService orderInfoService;
    @RequestMapping("/orderNum")
    @ResponseBody
    public Map<String,Object> showOrderNum(Integer userId){
        Map<String,Object> map = new HashMap<String, Object>();
            map.put("orderSuccess",orderService.orderCount(userId,"已完成"));
            map.put("orderCount",orderService.orderCount(userId,null));
            return map;
    }
    @RequestMapping("/orderList")
    public String showOrderList(Model model, HttpSession session,Integer pageId) {
        if(pageId == null){
            pageId = 1;
        }
        Users user = (Users) session.getAttribute("user");
       PageBean<Order> pageBean = orderService.orderList(user.getId(),pageId);
    model.addAttribute("pageBean", pageBean);
    return "member_order";
    }
    @RequestMapping("/orderDetail")
    @ResponseBody
    public Map<String,Object> showOrderDetail(Integer orderId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("orderDetailsList",orderDetailsService.getOrderDetails(orderId));
        return map;
    }
    @RequestMapping("/orderInfo")
    @ResponseBody
    public Map<String,Object> showOrderInfo(Integer orderId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("orderInfo",orderInfoService.getOrderInfo(orderId));
        map.put("menuOrderList",orderInfoService.getMenuOrders(orderId));
        return map;
    }
    @RequestMapping("/shopOrder")
    public String showShopOrder(Model model){
        model.addAttribute("orderList",orderInfoService.getOrderInfos());
        model.addAttribute("orderDetailsList",orderDetailsService.getOrderDetails(null));
        return "shop_order";
    }
    @RequestMapping("/orderNum2")
    @ResponseBody
    public Map<String,Object> getNum(Integer orderId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("num",orderService.getNum(orderId));
        return map;
    }
}
