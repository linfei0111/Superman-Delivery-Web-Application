package cn.kgc.service.huang.impl;


import cn.kgc.mapper.huang.OrderInfoMapper2;
import cn.kgc.service.huang.OrderInfoService2;
import cn.kgc.vo.h.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoService2Impl2 implements OrderInfoService2 {
    @Autowired
    private OrderInfoMapper2 orderInfoMapper2;


    public List<OrderInfo> getOrderInfos() {
       return orderInfoMapper2.getOrderInfoList();
    }
}
