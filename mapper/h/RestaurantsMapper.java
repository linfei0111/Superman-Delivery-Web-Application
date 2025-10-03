package cn.kgc.mapper.h;

import cn.kgc.entity.h.Restaurants;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RestaurantsMapper {

    public List<Restaurants> getRestaurants(@Param("cityId") Integer cityId,@Param("DeAddress") String address);
    public int addRestaurants(Restaurants restaurants);
}
