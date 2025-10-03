package cn.kgc.vo.h;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;


public class OrderInfo implements Serializable {
    private Integer id;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd" , timezone = "GMT+8")
    private Date orderDate;
    private String address;
    private BigDecimal totalAmount;
    private BigDecimal totalPrice;
    private String comment;


    public OrderInfo() {
    }

    public OrderInfo(Integer id, String phone, Date orderDate, String address, BigDecimal totalAmount, BigDecimal totalPrice, String comment) {
        this.id = id;
        this.phone = phone;
        this.orderDate = orderDate;
        this.address = address;
        this.totalAmount = totalAmount;
        this.totalPrice = totalPrice;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置
     * @param totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取
     * @return totalPrice
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置
     * @param totalPrice
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
        return "OrderInfo{id = " + id + ", phone = " + phone + ", orderDate = " + orderDate + ", address = " + address + ", totalAmount = " + totalAmount + ", totalPrice = " + totalPrice + ", comment = " + comment + "}";
    }
}
