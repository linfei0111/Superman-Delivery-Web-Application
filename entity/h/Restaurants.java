package cn.kgc.entity.h;

import java.io.Serializable;
import java.sql.Time;

public class Restaurants implements Serializable {
    private Integer id;
    private Integer brandId;
    private String name;
    private Double minOrderPrice;
    private Double deliveryFee;
    private Integer deliveryTime;
    private Double rating;
    private Boolean onlinePayment;
    private String logoUrl;
    private String address;
    private Integer cityId;
    private Boolean isScheduled;
    private String ownerName;
    private String phone;
    private String resSort;
    private Time startTime;
    private Time endTime;
    private Integer salesQuantity;
    private String introduce;

    private Brands brands;

    public Restaurants() {
    }

    public Restaurants(Integer id, Integer brandId, String name, Double minOrderPrice, Double deliveryFee, Integer deliveryTime, Double rating, Boolean onlinePayment, String logoUrl, String address, Integer cityId, Boolean isScheduled, String ownerName, String phone, String resSort, Time startTime, Time endTime, Integer salesQuantity, String introduce, Brands brands) {
        this.id = id;
        this.brandId = brandId;
        this.name = name;
        this.minOrderPrice = minOrderPrice;
        this.deliveryFee = deliveryFee;
        this.deliveryTime = deliveryTime;
        this.rating = rating;
        this.onlinePayment = onlinePayment;
        this.logoUrl = logoUrl;
        this.address = address;
        this.cityId = cityId;
        this.isScheduled = isScheduled;
        this.ownerName = ownerName;
        this.phone = phone;
        this.resSort = resSort;
        this.startTime = startTime;
        this.endTime = endTime;
        this.salesQuantity = salesQuantity;
        this.introduce = introduce;
        this.brands = brands;
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
     * @return brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置
     * @param brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
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
     * @return minOrderPrice
     */
    public Double getMinOrderPrice() {
        return minOrderPrice;
    }

    /**
     * 设置
     * @param minOrderPrice
     */
    public void setMinOrderPrice(Double minOrderPrice) {
        this.minOrderPrice = minOrderPrice;
    }

    /**
     * 获取
     * @return deliveryFee
     */
    public Double getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * 设置
     * @param deliveryFee
     */
    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * 获取
     * @return deliveryTime
     */
    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置
     * @param deliveryTime
     */
    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
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
     * @return onlinePayment
     */
    public Boolean getOnlinePayment() {
        return onlinePayment;
    }

    /**
     * 设置
     * @param onlinePayment
     */
    public void setOnlinePayment(Boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
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
     * @return cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取
     * @return isScheduled
     */
    public Boolean getIsScheduled() {
        return isScheduled;
    }

    /**
     * 设置
     * @param isScheduled
     */
    public void setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    /**
     * 获取
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 设置
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
     * @return startTime
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * 设置
     * @param startTime
     */
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     * @return endTime
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * 设置
     * @param endTime
     */
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     * @return salesQuantity
     */
    public Integer getSalesQuantity() {
        return salesQuantity;
    }

    /**
     * 设置
     * @param salesQuantity
     */
    public void setSalesQuantity(Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    /**
     * 获取
     * @return introduce
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 设置
     * @param introduce
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 获取
     * @return brands
     */
    public Brands getBrands() {
        return brands;
    }

    /**
     * 设置
     * @param brands
     */
    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public String toString() {
        return "Restaurants{id = " + id + ", brandId = " + brandId + ", name = " + name + ", minOrderPrice = " + minOrderPrice + ", deliveryFee = " + deliveryFee + ", deliveryTime = " + deliveryTime + ", rating = " + rating + ", onlinePayment = " + onlinePayment + ", logoUrl = " + logoUrl + ", address = " + address + ", cityId = " + cityId + ", isScheduled = " + isScheduled + ", ownerName = " + ownerName + ", phone = " + phone + ", resSort = " + resSort + ", startTime = " + startTime + ", endTime = " + endTime + ", salesQuantity = " + salesQuantity + ", introduce = " + introduce + ", brands = " + brands + "}";
    }
}
