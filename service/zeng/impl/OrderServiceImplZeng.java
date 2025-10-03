package cn.kgc.service.zeng.impl;

import cn.kgc.entity.h.Order;
import cn.kgc.mapper.zeng.OrderMapperZeng;
import cn.kgc.service.zeng.OrderServiceZeng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplZeng implements OrderServiceZeng {
    @Autowired
    private OrderMapperZeng orderMapper;

    @Override
    public Boolean addOrder(Order order) {
            return orderMapper.insertOrder(order)>0;
    }

/*    @Override
    public void createOrderWithDetails(Order order) {
        // 插入订单
        orderMapper.insertOrder(order);
        // 获取插入后的订单ID
        int orderId = order.getId();
        // 插入订单详情
//        for (ShoppingCart shoppingCart : shoppingCarts){
//                shoppingCart.setOrderId(orderId);
//                orderMapper.insertShoppingCart(shoppingCart);
//        }

        }*/

    }