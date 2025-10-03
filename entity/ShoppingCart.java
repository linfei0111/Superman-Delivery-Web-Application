package cn.kgc.entity;

import java.io.Serializable;

public class ShoppingCart implements Serializable {
    // 主键
    private Integer id;

    // 订单ID
    private Integer orderId;

    // 菜单ID
    private Integer menuId;

    // 份数
    private Integer quantity;

    // 单价
    private Double unitPrice;

    // 小计
    private Double subtotal;

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ShoppingCart() {
    }

    public ShoppingCart(Integer orderId, Integer menuId, Integer quantity, Double unitPrice, Double subtotal) {
        this.orderId = orderId;
        this.menuId = menuId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
    }

    public ShoppingCart(Integer id, Integer orderId, Integer menuId, Integer quantity, Double unitPrice, Double subtotal) {
        this.id = id;
        this.orderId = orderId;
        this.menuId = menuId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
