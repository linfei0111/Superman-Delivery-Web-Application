package cn.kgc.vo.h;

public class MenuOrder {
    private Integer id;
    private String name;
    private Integer price;
    private Integer quantity;
    private Double subtotal;

    public MenuOrder() {
    }

    public MenuOrder(Integer id, String name, Integer price, Integer quantity, Double subtotal) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
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
        return "MenuOrder{id = " + id + ", name = " + name + ", price = " + price + ", quantity = " + quantity + ", subtotal = " + subtotal + "}";
    }
}
