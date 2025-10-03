package cn.kgc.controller.lin;

import cn.kgc.entity.h.Brands;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.service.lin.BrandsServiceLin;
import cn.kgc.service.lin.RestaurantServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/restaurants")
public class RestaurantsControllerLin {

    @Autowired
    private RestaurantServiceLin restaurantServiceLin;
    @Autowired
    private BrandsServiceLin brandsServiceLin;



    @RequestMapping("/list")
    public String showRestaurantsList(Integer brandId, Model model) {
        Brands brands = brandsServiceLin.getBrandById(brandId);
        List<Restaurants> restaurantsList = restaurantServiceLin.restaurantsList(brandId);

        model.addAttribute("brands", brands);
        model.addAttribute("restaurantsList", restaurantsList);

        return "shop_brand";

    }
}
