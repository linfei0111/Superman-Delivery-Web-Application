package cn.kgc.entity;

import java.io.Serializable;
import java.util.List;

public class Categories implements Serializable {
    private Integer id;
    private String name;
    private String restaurantId;
    private List<Menu> menuItems;

    public Categories() {
    }

    public Categories(List<Menu> menuItems) {
        this.menuItems = menuItems;
    }

    public List<Menu> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Menu> menuItems) {
        this.menuItems = menuItems;
    }

    public Categories(Integer id, String name, String restaurantId) {
        this.id = id;
        this.name = name;
        this.restaurantId = restaurantId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
