package cn.kgc.service.huang.impl;


import cn.kgc.mapper.huang.OrderDetailsMapper2;
import cn.kgc.service.huang.OrderDetailsService2;
import cn.kgc.vo.h.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailsService2Impl2 implements OrderDetailsService2 {
    @Autowired
    private OrderDetailsMapper2 orderDetailsMapper2;
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsMapper2.getAllOrderDetails();
    }

    public List<OrderDetails> getOrderDetails(int id) {
        return orderDetailsMapper2.getOrderDetailsByOrderId(id);
    }

}
