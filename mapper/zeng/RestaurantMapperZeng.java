package cn.kgc.mapper.zeng;

import cn.kgc.entity.h.Restaurants;

public interface RestaurantMapperZeng {
    /**
     * 获取所有餐厅信息
     * @return 餐厅列表
     */
    public Restaurants selectRestaurants(Integer restaurantId);
}
