package cn.kgc.mapper.h;

import cn.kgc.vo.h.MenuOrder;
import cn.kgc.vo.h.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    public OrderInfo getOrderInfo(Integer OrderId);
    public List<MenuOrder> getMenuOrders(Integer OrderId);
    public List<OrderInfo> getOrderInfoList();

}
