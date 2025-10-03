package cn.kgc.vo.h;

import java.io.Serializable;

public class OrderDetails implements Serializable {
    private Integer id;
    private Integer orderId;
    private Integer menuItemId;
    private String menuName;
    private Integer quantity;
    private Double unitPrice;
    private Double subtotal;


    public OrderDetails() {
    }

    public OrderDetails(Integer id, Integer orderId, Integer menuItemId, String menuName, Integer quantity, Double unitPrice, Double subtotal) {
        this.id = id;
        this.orderId = orderId;
        this.menuItemId = menuItemId;
        this.menuName = menuName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
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
     * @return orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取
     * @return menuItemId
     */
    public Integer getMenuItemId() {
        return menuItemId;
    }

    /**
     * 设置
     * @param menuItemId
     */
    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    /**
     * 获取
     * @return menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置
     * @param unitPrice
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 获取
     * @return subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * 设置
     * @param subtotal
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String toString() {
        return "OrderDetails{id = " + id + ", orderId = " + orderId + ", menuItemId = " + menuItemId + ", menuName = " + menuName + ", quantity = " + quantity + ", unitPrice = " + unitPrice + ", subtotal = " + subtotal + "}";
    }
}
