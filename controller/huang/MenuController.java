package cn.kgc.controller.huang;


import cn.kgc.entity.h.Comments;
import cn.kgc.entity.h.Users;
import cn.kgc.service.huang.*;
import cn.kgc.vo.h.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private OrderInfoService2 orderInfoService2;
    @Autowired
    private OrderDetailsService2 orderDetailsService2;
    @Autowired
    private CommentsService2 commentsService2;
    @Autowired
    private RestaurantsService2 restaurantsService2;
    @Autowired
    private FavoriteService2 favoriteService2;


@RequestMapping("/allBrand")
    public String allOrder(Model model){
        return "member_order";
    }
    @RequestMapping("/shopOrder")
    public String showShopOrder(Model model,Integer rid,HttpSession session){
        Users user = (Users) session.getAttribute("user");
        model.addAttribute("restaurant", restaurantsService2.findById(rid));
        model.addAttribute("isFavorite", favoriteService2.isFavorite(rid,user.getId()));
        model.addAttribute("orderList", orderInfoService2.getOrderInfos());
        model.addAttribute("orderDetailsList", orderDetailsService2.getAllOrderDetails());
        return "shop_order";
    }
    @RequestMapping("/shopComment")
    public String showShopComment(Model model,Integer rid,Boolean content,HttpSession session){
        Users user = (Users) session.getAttribute("user");
        if(content == null) {
        content = false;
    }
        List<Comments> commentsList = commentsService2.getAllComments(rid, content);
        model.addAttribute("restaurant", restaurantsService2.findById(rid));
        model.addAttribute("commentsList",commentsList);
        model.addAttribute("count",commentsList.size());
        model.addAttribute("isFavorite", favoriteService2.isFavorite(rid,user.getId()));
        return "shop_comment";
    }
    @RequestMapping("/showOrderInfo")
    @ResponseBody
    public Map<String,Object> showOrderInfo(Integer orderId){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("orderDetailsList", orderDetailsService2.getOrderDetails(orderId));
        return map;
    }
    @RequestMapping("/addFavorite")
    @ResponseBody
    public Boolean addFavorite(Integer rid, HttpSession session){
     /*Users user =   (User)session.getAttribute("user");*/
        Favorite favorite = new Favorite();
        favorite.setRestaurantId(rid);
        favorite.setUserId(1);
        favorite.setCreateAt(new Date(System.currentTimeMillis()));
        return favoriteService2.insertFavorite(favorite);
    }
    @RequestMapping("/deleteFavorite")
    @ResponseBody
    public Boolean deleteFavorite(Integer rid, HttpSession session){
        /*Users user =   (User)session.getAttribute("user");*/
        return favoriteService2.deleteFavorite(rid,1);
    }
}
