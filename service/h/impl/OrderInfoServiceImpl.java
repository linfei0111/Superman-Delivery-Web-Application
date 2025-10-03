package cn.kgc.service.h.impl;

import cn.kgc.mapper.h.OrderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.OrderInfoService;
import cn.kgc.vo.h.MenuOrder;
import cn.kgc.vo.h.OrderInfo;

import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    public OrderInfo getOrderInfo(int orderId) {
        return orderInfoMapper.getOrderInfo(orderId);
    }

    public List<MenuOrder> getMenuOrders(int orderId) {
        return orderInfoMapper.getMenuOrders(orderId);
    }

    public List<OrderInfo> getOrderInfos() {
       return orderInfoMapper.getOrderInfoList();
    }
}
