package cn.kgc.controller.xiao;

import cn.kgc.entity.h.Restaurants;
import cn.kgc.service.xiao.RestaurantsService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class RestaurantsController3 {

    @Autowired
    private RestaurantsService3 restaurantsService;

    @RequestMapping("/show")
    public String showRestaurants(Integer cityId, Model model){
        List<Restaurants> inBusinessRestaurantsList = restaurantsService.selectInBusinessRestaurantsByCityId(1);
        List<Restaurants> closedRestaurantsList = restaurantsService.selectClosedRestaurantsByCityId(1);
        List<Restaurants> scheduledRestaurantsList = restaurantsService.selectScheduledRestaurantsByCityId(1);
        model.addAttribute("inBusinessRestaurantsList", inBusinessRestaurantsList);
        model.addAttribute("closedRestaurantsList", closedRestaurantsList);
        model.addAttribute("scheduledRestaurantsList", scheduledRestaurantsList);
        return "shop_list";
    }
}
