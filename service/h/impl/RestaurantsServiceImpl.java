package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Restaurants;
import cn.kgc.mapper.h.CityMapper;
import cn.kgc.mapper.h.RestaurantsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.RestaurantsService;

import java.util.List;
@Service
public class RestaurantsServiceImpl implements RestaurantsService {
    @Autowired
    private RestaurantsMapper restaurantsMapper;
    @Autowired
    private CityMapper cityMapper;
    public List<Restaurants> showRestaurants(Integer cityId, String address) {
        return restaurantsMapper.getRestaurants(cityId, address);
    }

    public Boolean addRestaurant(String name,String city,String zone,String ownerName,String phone) {
        Restaurants restaurant = new Restaurants();
        restaurant.setName(name+"("+zone+")");
        restaurant.setAddress(city+zone);
        restaurant.setOwnerName(ownerName);
        restaurant.setPhone(phone);
        restaurant.setCityId(cityMapper.selectId(city));
        return restaurantsMapper.addRestaurants(restaurant) > 0;
    }
}
