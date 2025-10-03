package cn.kgc.mapper.lin;

import cn.kgc.entity.h.Order;

import java.util.List;

public interface OrderMapperLin {
    public List<Order> getOrderListByUserId(Integer userId);
    public int updateOrderStatusByOrderNo(Order order);
    public Order getOrderByOrderNo(String orderNo);
}
