package cn.kgc.service.h;

import cn.kgc.entity.h.Order;
import cn.kgc.util.PageBean;

public interface OrderService {
    public int orderCount(Integer UserId,String status);
    public PageBean<Order> orderList(Integer UserId,Integer pageId);
    public Boolean updateStatus(Integer OrderId,String status);
    public Long getNum(Integer OrderId);
}
