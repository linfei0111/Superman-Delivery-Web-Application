package cn.kgc.entity;

import java.io.Serializable;

public class Menu implements Serializable {
    private Integer menuId;

    private String menuName;

    private String description;

    private Double price;

    private Integer saleCount;

    private String imageUrl;

    private Integer categoryId;

    private Integer restaurantId;

    private Boolean isFeatured;

    private String promotionType;

    private Double promotionValue;

    private Categories categories;

    public Menu() {
    }

    public Menu(Integer menuId, String menuName, String description, Double price, Integer saleCount, String imageUrl, Integer categoryId, Integer restaurantId, Boolean isFeatured, String promotionType, Double promotionValue, Integer sale) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.description = description;
        this.price = price;
        this.saleCount = saleCount;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
        this.restaurantId = restaurantId;
        this.isFeatured = isFeatured;
        this.promotionType = promotionType;
        this.promotionValue = promotionValue;
    }


    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Boolean getFeatured() {
        return isFeatured;
    }

    public void setFeatured(Boolean featured) {
        isFeatured = featured;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Double getPromotionValue() {
        return promotionValue;
    }

    public void setPromotionValue(Double promotionValue) {
        this.promotionValue = promotionValue;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }


    public Menu(Integer menuId, String menuName, String description, Double price, Integer saleCount, String imageUrl, Integer categoryId, Integer restaurantId, Boolean isFeatured, String promotionType, Double promotionValue, Integer sale, Categories categories) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.description = description;
        this.price = price;
        this.saleCount = saleCount;
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
        this.restaurantId = restaurantId;
        this.isFeatured = isFeatured;
        this.promotionType = promotionType;
        this.promotionValue = promotionValue;
        this.categories = categories;
    }
}
