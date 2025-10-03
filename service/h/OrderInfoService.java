package cn.kgc.service.h;

import cn.kgc.vo.h.MenuOrder;
import cn.kgc.vo.h.OrderInfo;

import java.util.List;

public interface OrderInfoService {
    public OrderInfo getOrderInfo(int orderId);
    public List<MenuOrder> getMenuOrders(int orderId);
    public List<OrderInfo> getOrderInfos();
}
