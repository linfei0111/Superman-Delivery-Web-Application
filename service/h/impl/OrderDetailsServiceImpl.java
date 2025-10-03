package cn.kgc.service.h.impl;

import cn.kgc.mapper.h.OrderDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.OrderDetailsService;
import cn.kgc.vo.h.OrderDetails;

import java.util.List;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsMapper orderDetailsMapper;
    public List<OrderDetails> getOrderDetails(Integer orderId) {
        return orderDetailsMapper.getOrderDetails(orderId);
    }
}
