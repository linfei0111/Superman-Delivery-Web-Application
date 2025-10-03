package cn.kgc.service.huang.impl;



import cn.kgc.entity.h.Restaurants;
import cn.kgc.mapper.huang.RestaurantsMapper2;
import cn.kgc.service.huang.RestaurantsService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RestaurantsService2Impl2 implements RestaurantsService2 {
    @Autowired
    private RestaurantsMapper2 restaurantsMapper2;

    public Restaurants findById(int id) {
        return restaurantsMapper2.getRestaurant(id);
    }
}
