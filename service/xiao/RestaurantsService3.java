package cn.kgc.service.xiao;

import cn.kgc.entity.h.Restaurants;

import java.util.List;

public interface RestaurantsService3 {

    public List<Restaurants> selectInBusinessRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectClosedRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectScheduledRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectRestaurants();

}
