package cn.kgc.controller.h;

import cn.kgc.entity.h.Restaurants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.kgc.service.h.FavoriteService;
import cn.kgc.service.h.RestaurantsService;
import cn.kgc.vo.h.Favorite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/res")
public class RestaurantsController {
    @Autowired
    private RestaurantsService restaurantsService;
    @Autowired
    private FavoriteService favoriteService;
    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> addRestaurant(String name,String city,String zone,String ownerName,String phone){
        Map<String,Object> map = new HashMap();
        map.put("status",restaurantsService.addRestaurant(name,city,zone,ownerName,phone));
        return map;
    }
    @RequestMapping("/show")
    public String showRestaurant(Integer cityId, String address, Model model){
        //List<Restaurants> restaurants = restaurantsService.showRestaurants(cityId, address);
        //model.addAttribute("restaurants",restaurants);
        return "redirect:/shop/show";
    }
    @RequestMapping("/favorite/{userId}")
    public String favoriteRestaurant(@PathVariable("userId") Integer userId, Model model){
        List<Favorite> favorites = favoriteService.getFavorites(userId);
        model.addAttribute("favorites",favorites);
        return "member_collect";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Boolean deleteRestaurant(Integer id){
        return favoriteService.deleteFavorite(id);
    }
}
