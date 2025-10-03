package cn.kgc.service.huang;



import cn.kgc.vo.h.OrderDetails;

import java.util.List;

public interface OrderDetailsService2 {
    public List<OrderDetails> getAllOrderDetails();
    public List<OrderDetails> getOrderDetails(int id);
}
