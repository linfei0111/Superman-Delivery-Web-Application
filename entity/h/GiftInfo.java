package cn.kgc.entity.h;

import java.sql.Date;

public class GiftInfo {
    private Integer id;
    private String giftName;
    private String userName;
    private String phone;
    private String address;
    private Date giftDate;
    private String result;
    private Integer uid;

    public GiftInfo() {
    }

    public GiftInfo(Integer id, String giftName, String userName, String phone, String address, Date giftDate, String result, Integer uid) {
        this.id = id;
        this.giftName = giftName;
        this.userName = userName;
        this.phone = phone;
        this.address = address;
        this.giftDate = giftDate;
        this.result = result;
        this.uid = uid;
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
     * @return giftName
     */
    public String getGiftName() {
        return giftName;
    }

    /**
     * 设置
     * @param giftName
     */
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return giftDate
     */
    public Date getGiftDate() {
        return giftDate;
    }

    /**
     * 设置
     * @param giftDate
     */
    public void setGiftDate(Date giftDate) {
        this.giftDate = giftDate;
    }

    /**
     * 获取
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String toString() {
        return "GiftInfo{id = " + id + ", giftName = " + giftName + ", userName = " + userName + ", phone = " + phone + ", address = " + address + ", giftDate = " + giftDate + ", result = " + result + ", uid = " + uid + "}";
    }
}
