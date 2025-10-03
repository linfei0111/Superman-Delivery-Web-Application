package cn.kgc.mapper.huang;

import cn.kgc.vo.h.OrderDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailsMapper2 {
    public List<OrderDetails> getAllOrderDetails();
    public List<OrderDetails> getOrderDetailsByOrderId(@Param("orderId") Integer orderId);
}
