package cn.kgc.mapper.h;

import org.apache.ibatis.annotations.Param;
import cn.kgc.vo.h.OrderDetails;

import java.util.List;

public interface OrderDetailsMapper {
    public List<OrderDetails> getOrderDetails(@Param("orderId") Integer orderId);
}
