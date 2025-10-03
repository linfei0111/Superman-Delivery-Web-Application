package cn.kgc.mapper.h;

import cn.kgc.entity.h.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    public int selectCount(@Param("userId") Integer userId,@Param("status") String status);
    public List<Order> selectAll(@Param("userId") Integer userId,@Param("pageId") Integer pageId,@Param("rowNum") Integer rowNum);
    public int updateOrderStatus(@Param("orderId") Integer orderId,@Param("status") String status);
    public Long getNum(@Param("orderId") Integer orderId);
}
