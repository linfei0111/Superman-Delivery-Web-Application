package cn.kgc.entity.h;

import java.sql.Date;

public class DeAddress {
    private Integer id;
    private Integer userId;
    private String receiverName;
    private String phone;
    private String address;
    private Boolean isDefault;
    private Date createdAt;
    private Date updatedAt;

    public DeAddress() {
    }

    public DeAddress(Integer id, Integer userId, String receiverName, String phone, String address, Boolean isDefault, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.receiverName = receiverName;
        this.phone = phone;
        this.address = address;
        this.isDefault = isDefault;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * @return receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置
     * @param receiverName
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
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
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取
     * @return createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String toString() {
        return "DeAddress{id = " + id + ", userId = " + userId + ", receiverName = " + receiverName + ", phone = " + phone + ", address = " + address + ", isDefault = " + isDefault + ", createdAt = " + createdAt + ", updatedAt = " + updatedAt + "}";
    }
}
