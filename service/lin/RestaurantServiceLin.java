package cn.kgc.service.lin;

import cn.kgc.entity.h.Restaurants;

import java.util.List;

public interface RestaurantServiceLin {
    /**
     * 获取所有餐厅信息
     * @return 餐厅列表
     */
    public List<Restaurants> restaurantsList(Integer brandId);
    public Restaurants restaurantsDetail(Integer id);
}
