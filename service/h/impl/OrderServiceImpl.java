package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Order;
import cn.kgc.mapper.h.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.OrderService;
import cn.kgc.util.PageBean;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    public int orderCount(Integer userId,String status) {
        return orderMapper.selectCount(userId,status);
    }

    public PageBean<Order> orderList(Integer userId, Integer pageId) {
        PageBean<Order> pageBean = new PageBean<Order>();
        pageBean.setPageId(pageId);
        List<Order> orderList = orderMapper.selectAll(userId,pageId,5);
        pageBean.setResult(orderList);
        pageBean.setTotalRow(orderMapper.selectCount(userId,null));
        pageBean.setRowNum(5);
        return pageBean;
    }

    public Boolean updateStatus(Integer OrderId, String status) {
        return orderMapper.updateOrderStatus(OrderId,status) > 0;
    }

    public Long getNum(Integer OrderId) {
        return orderMapper.getNum(OrderId);
    }
}
