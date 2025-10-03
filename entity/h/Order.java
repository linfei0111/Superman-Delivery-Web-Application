package cn.kgc.entity.h;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
    private Integer oid; // 订单id
    private Integer userId; // 用户ID
    private Integer restaurantId; // 餐厅ID
    private Date orderDate; // 下单时间
    private Double totalAmount; // 订单总额
    private String deliveryAddress; // 配送地址
    private String status; // 订单状态
    private String paymentMethod; // 支付方式
    private Restaurants restaurant;
    private Long orderNum;
    private Integer addressId;
    private String comment;

    public Order() {
    }

    public Order(Integer oid, Integer userId, Integer restaurantId, Date orderDate, Double totalAmount, String deliveryAddress, String status, String paymentMethod, Restaurants restaurant, Long orderNum, Integer addressId, String comment) {
        this.oid = oid;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.restaurant = restaurant;
        this.orderNum = orderNum;
        this.addressId = addressId;
        this.comment = comment;
    }

    /**
     * 获取
     * @return oid
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置
     * @param oid
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return totalAmount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置
     * @param totalAmount
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * 设置
     * @param deliveryAddress
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
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
     * @return restaurant
     */
    public Restaurants getRestaurant() {
        return restaurant;
    }

    /**
     * 设置
     * @param restaurant
     */
    public void setRestaurant(Restaurants restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * 获取
     * @return orderNum
     */
    public Long getOrderNum() {
        return orderNum;
    }

    /**
     * 设置
     * @param orderNum
     */
    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
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
        return "Order{oid = " + oid + ", userId = " + userId + ", restaurantId = " + restaurantId + ", orderDate = " + orderDate + ", totalAmount = " + totalAmount + ", deliveryAddress = " + deliveryAddress + ", status = " + status + ", paymentMethod = " + paymentMethod + ", restaurant = " + restaurant + ", orderNum = " + orderNum + ", addressId = " + addressId + ", comment = " + comment + "}";
    }
}
