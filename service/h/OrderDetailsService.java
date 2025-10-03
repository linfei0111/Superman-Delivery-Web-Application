package cn.kgc.service.h;

import cn.kgc.vo.h.OrderDetails;

import java.util.List;

public interface OrderDetailsService {
    public List<OrderDetails> getOrderDetails(Integer orderId);
}
