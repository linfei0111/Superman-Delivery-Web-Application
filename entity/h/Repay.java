package cn.kgc.entity.h;

import java.io.Serializable;

public class Repay implements Serializable {
    private Integer id;
    private Integer orderId;
    private String phone;
    private String repayType;
    private Double repayMoney;
    private String repayInfo;
    private String repayImg;
    private String repayOther;
    public Repay() {
    }

    public Repay(Integer id, Integer orderId, String phone, String repayType, Double repayMoney, String repayInfo, String repayImg, String repayOther) {
        this.id = id;
        this.orderId = orderId;
        this.phone = phone;
        this.repayType = repayType;
        this.repayMoney = repayMoney;
        this.repayInfo = repayInfo;
        this.repayImg = repayImg;
        this.repayOther = repayOther;
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
     * @return repayType
     */
    public String getRepayType() {
        return repayType;
    }

    /**
     * 设置
     * @param repayType
     */
    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    /**
     * 获取
     * @return repayMoney
     */
    public Double getRepayMoney() {
        return repayMoney;
    }

    /**
     * 设置
     * @param repayMoney
     */
    public void setRepayMoney(Double repayMoney) {
        this.repayMoney = repayMoney;
    }

    /**
     * 获取
     * @return repayInfo
     */
    public String getRepayInfo() {
        return repayInfo;
    }

    /**
     * 设置
     * @param repayInfo
     */
    public void setRepayInfo(String repayInfo) {
        this.repayInfo = repayInfo;
    }

    /**
     * 获取
     * @return repayImg
     */
    public String getRepayImg() {
        return repayImg;
    }

    /**
     * 设置
     * @param repayImg
     */
    public void setRepayImg(String repayImg) {
        this.repayImg = repayImg;
    }

    /**
     * 获取
     * @return repayOther
     */
    public String getRepayOther() {
        return repayOther;
    }

    /**
     * 设置
     * @param repayOther
     */
    public void setRepayOther(String repayOther) {
        this.repayOther = repayOther;
    }

    public String toString() {
        return "Repay{id = " + id + ", orderId = " + orderId + ", phone = " + phone + ", repayType = " + repayType + ", repayMoney = " + repayMoney + ", repayInfo = " + repayInfo + ", repayImg = " + repayImg + ", repayOther = " + repayOther + "}";
    }
}
