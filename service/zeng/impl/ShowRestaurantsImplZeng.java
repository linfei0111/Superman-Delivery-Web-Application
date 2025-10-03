package cn.kgc.service.zeng.impl;

import cn.kgc.entity.h.Restaurants;
import cn.kgc.mapper.zeng.RestaurantMapperZeng;
import cn.kgc.service.zeng.RestaurantServiceZeng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowRestaurantsImplZeng implements RestaurantServiceZeng {
    @Autowired
    private RestaurantMapperZeng restaurantMapperZeng;
    @Override
    public Restaurants showRestaurants(Integer restaurantId) {
        return restaurantMapperZeng.selectRestaurants(restaurantId);
    }
}
