package cn.kgc.service.h;

import cn.kgc.entity.h.Restaurants;

import java.util.List;

public interface RestaurantsService {
    public List<Restaurants> showRestaurants(Integer cityId, String address);
    public Boolean addRestaurant(String name,String city,String zone,String ownerName,String phone);
}
