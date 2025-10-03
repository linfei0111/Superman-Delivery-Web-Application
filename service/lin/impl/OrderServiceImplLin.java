package cn.kgc.service.lin.impl;

import cn.kgc.entity.h.Order;
import cn.kgc.mapper.lin.OrderMapperLin;
import cn.kgc.service.lin.OrderServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplLin implements OrderServiceLin {

    @Autowired
    private OrderMapperLin orderMapperLin;

    @Override
    public List<Order> getOrders(Integer userId) {
        return orderMapperLin.getOrderListByUserId(userId);
    }

    @Override
    public boolean updateOrder(Order order) {
        return orderMapperLin.updateOrderStatusByOrderNo(order)>0;
    }

    @Override
    public Order getOrder(String orderNo) {
        return orderMapperLin.getOrderByOrderNo(orderNo);
    }

}
