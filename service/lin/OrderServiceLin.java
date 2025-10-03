package cn.kgc.service.lin;

import cn.kgc.entity.h.Order;

import java.util.List;

public interface OrderServiceLin {
    public List<Order> getOrders(Integer userId);
    public boolean updateOrder(Order order);
    public Order getOrder(String orderNo);
}
