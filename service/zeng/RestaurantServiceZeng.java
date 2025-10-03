package cn.kgc.service.zeng;

import cn.kgc.entity.h.Restaurants;

public interface RestaurantServiceZeng {
    /**
     * 获取所有餐厅信息
     * @return 餐厅列表
     */
    public Restaurants showRestaurants(Integer restaurantId);
}
