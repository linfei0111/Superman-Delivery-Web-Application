package cn.kgc.mapper.xiao;

import cn.kgc.entity.h.Restaurants;

import java.util.List;

public interface RestaurantsMapper3 {

    public List<Restaurants> selectInBusinessRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectClosedRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectScheduledRestaurantsByCityId(Integer cityId);

    public List<Restaurants> selectRestaurants();
}
