package cn.kgc.mapper.lin;

import cn.kgc.entity.h.Restaurants;

import java.util.List;

public interface RestaurantMapperLin {
    /**
     * 获取所有餐厅信息
     * @return 餐厅列表
     */
    public List<Restaurants> getAllRestaurants(Integer brandId);
    public Restaurants getRestaurantById(Integer id);
}
