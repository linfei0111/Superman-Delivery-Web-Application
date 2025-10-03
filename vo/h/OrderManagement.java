package cn.kgc.vo.h;

import java.sql.Date;

public class OrderManagement {
    private Integer id;
    // 对应数据库表中的users_id字段
    private Integer usersId;
    // 对应数据库表中的restaurant_id字段
    private Integer restaurantId;
    // 对应数据库表中的order_num字段
    private String orderNum;
    // 对应数据库表中的total_money字段
    private Double totalMoney;
    // 对应数据库表中的order_date字段
    private Date orderDate;
    // 对应数据库表中的status字段
    private String status;
    // 对应数据库表中的addressId字段
    private Integer addressId;
    // 对应数据库表中的payment_method字段
    private String paymentMethod;
    // 对应数据库表中的comment字段
    private String comment;

    public OrderManagement() {
    }

    public OrderManagement(Integer id, Integer usersId, Integer restaurantId, String orderNum, Double totalMoney, Date orderDate, String status, Integer addressId, String paymentMethod, String comment) {
        this.id = id;
        this.usersId = usersId;
        this.restaurantId = restaurantId;
        this.orderNum = orderNum;
        this.totalMoney = totalMoney;
        this.orderDate = orderDate;
        this.status = status;
        this.addressId = addressId;
        this.paymentMethod = paymentMethod;
        this.comment = comment;
    }
    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return usersId
     */
    public Integer getUsersId() {
        return usersId;
    }

    /**
     * 设置
     * @param usersId
     */
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    /**
     * 获取
     * @return restaurantId
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     * 设置
     * @param restaurantId
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * 获取
     * @return orderNum
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置
     * @param orderNum
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取
     * @return totalMoney
     */
    public Double getTotalMoney() {
        return totalMoney;
    }

    /**
     * 设置
     * @param totalMoney
     */
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 获取
     * @return orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * 设置
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取
     * @return addressId
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 设置
     * @param addressId
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取
     * @return paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toString() {
        return "OrderManagement{id = " + id + ", usersId = " + usersId + ", restaurantId = " + restaurantId + ", orderNum = " + orderNum + ", totalMoney = " + totalMoney + ", orderDate = " + orderDate + ", status = " + status + ", addressId = " + addressId + ", paymentMethod = " + paymentMethod + ", comment = " + comment + "}";
    }
}
