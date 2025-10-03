package cn.kgc.entity.h;

import java.io.Serializable;
//品质商家表
public class Brands implements Serializable {
    private Integer id;
    private String name;
    private String picPath;
    public Brands() {
    }

    public Brands(Integer id, String name, String picPath) {
        this.id = id;
        this.name = name;
        this.picPath = picPath;
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
     * @return picPath
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置
     * @param picPath
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String toString() {
        return "Brands{id = " + id + ", name = " + name + ", picPath = " + picPath + "}";
    }
}
