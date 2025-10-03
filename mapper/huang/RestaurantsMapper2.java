package cn.kgc.mapper.huang;

import cn.kgc.entity.h.Restaurants;
import org.apache.ibatis.annotations.Param;

public interface RestaurantsMapper2 {

    public Restaurants getRestaurant(@Param("id") Integer id);
}
