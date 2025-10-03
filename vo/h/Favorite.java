package cn.kgc.vo.h;

import java.io.Serializable;
import java.sql.Date;

public class Favorite implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer restaurantId;
    private Date createAt;
    private String name;
    private Double rating;
    private String resSort;
    private String logoUrl;

    public Favorite() {
    }

    public Favorite(Integer id, Integer userId, Integer restaurantId, Date createAt, String name, Double rating, String resSort, String logoUrl) {
        this.id = id;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.createAt = createAt;
        this.name = name;
        this.rating = rating;
        this.resSort = resSort;
        this.logoUrl = logoUrl;
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
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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
     * @return rating
     */
    public Double getRating() {
        return rating;
    }

    /**
     * 设置
     * @param rating
     */
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * 获取
     * @return resSort
     */
    public String getResSort() {
        return resSort;
    }

    /**
     * 设置
     * @param resSort
     */
    public void setResSort(String resSort) {
        this.resSort = resSort;
    }

    /**
     * 获取
     * @return logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 设置
     * @param logoUrl
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String toString() {
        return "Favorite{id = " + id + ", userId = " + userId + ", restaurantId = " + restaurantId + ", createAt = " + createAt + ", name = " + name + ", rating = " + rating + ", resSort = " + resSort + ", logoUrl = " + logoUrl + "}";
    }
}
