package cn.kgc.service.xiao.impl;

import cn.kgc.entity.h.Restaurants;
import cn.kgc.mapper.xiao.RestaurantsMapper3;
import cn.kgc.service.xiao.RestaurantsService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantsService3Impl3 implements RestaurantsService3 {


    @Autowired
    private RestaurantsMapper3 restaurantsMapper3;

    @Override
    public List<Restaurants> selectInBusinessRestaurantsByCityId(Integer cityId) {
        List<Restaurants> restaurants = restaurantsMapper3.selectInBusinessRestaurantsByCityId(1);
        return restaurants;
    }

    @Override
    public List<Restaurants> selectClosedRestaurantsByCityId(Integer cityId) {
        List<Restaurants> restaurants = restaurantsMapper3.selectClosedRestaurantsByCityId(1);
        return restaurants;
    }

    @Override
    public List<Restaurants> selectScheduledRestaurantsByCityId(Integer cityId) {
        List<Restaurants> restaurants = restaurantsMapper3.selectScheduledRestaurantsByCityId(1);
        return restaurants;
    }

    @Override
    public List<Restaurants> selectRestaurants() {
        return restaurantsMapper3.selectRestaurants();
    }
}
