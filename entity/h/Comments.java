package cn.kgc.entity.h;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Date;

public class Comments implements Serializable {
        private Integer cid;
        private Integer oid;
        private Integer genView;
        private Integer smeView;
        private Integer serView;
        private Integer speView;
        private String commentInfo;
        private String orderTime;
        private String phone;
        @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
        private Date commentDate;


    public Comments() {
    }

    public Comments(Integer cid, Integer oid, Integer genView, Integer smeView, Integer serView, Integer speView, String commentInfo, String orderTime, String phone, Date commentDate) {
        this.cid = cid;
        this.oid = oid;
        this.genView = genView;
        this.smeView = smeView;
        this.serView = serView;
        this.speView = speView;
        this.commentInfo = commentInfo;
        this.orderTime = orderTime;
        this.phone = phone;
        this.commentDate = commentDate;
    }

    /**
     * 获取
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 获取
     * @return oid
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 设置
     * @param oid
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 获取
     * @return genView
     */
    public Integer getGenView() {
        return genView;
    }

    /**
     * 设置
     * @param genView
     */
    public void setGenView(Integer genView) {
        this.genView = genView;
    }

    /**
     * 获取
     * @return smeView
     */
    public Integer getSmeView() {
        return smeView;
    }

    /**
     * 设置
     * @param smeView
     */
    public void setSmeView(Integer smeView) {
        this.smeView = smeView;
    }

    /**
     * 获取
     * @return serView
     */
    public Integer getSerView() {
        return serView;
    }

    /**
     * 设置
     * @param serView
     */
    public void setSerView(Integer serView) {
        this.serView = serView;
    }

    /**
     * 获取
     * @return speView
     */
    public Integer getSpeView() {
        return speView;
    }

    /**
     * 设置
     * @param speView
     */
    public void setSpeView(Integer speView) {
        this.speView = speView;
    }

    /**
     * 获取
     * @return commentInfo
     */
    public String getCommentInfo() {
        return commentInfo;
    }

    /**
     * 设置
     * @param commentInfo
     */
    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    /**
     * 获取
     * @return orderTime
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * 设置
     * @param orderTime
     */
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
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
     * @return commentDate
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * 设置
     * @param commentDate
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String toString() {
        return "Comments{cid = " + cid + ", oid = " + oid + ", genView = " + genView + ", smeView = " + smeView + ", serView = " + serView + ", speView = " + speView + ", commentInfo = " + commentInfo + ", orderTime = " + orderTime + ", phone = " + phone + ", commentDate = " + commentDate + "}";
    }
}
