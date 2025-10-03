package cn.kgc.service.lin.impl;

import cn.kgc.entity.h.Restaurants;
import cn.kgc.mapper.lin.RestaurantMapperLin;
import cn.kgc.service.lin.RestaurantServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImplLin implements RestaurantServiceLin {

    @Autowired
    private RestaurantMapperLin restaurantMapper;

    @Override
    public List<Restaurants> restaurantsList(Integer brandId) {
         return restaurantMapper.getAllRestaurants(brandId);
    }

    @Override
    public Restaurants restaurantsDetail(Integer id) {
        return restaurantMapper.getRestaurantById(id);
    }

}
