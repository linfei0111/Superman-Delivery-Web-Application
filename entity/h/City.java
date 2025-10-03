package cn.kgc.entity.h;

import java.io.Serializable;

public class City implements Serializable {
    private Integer id;
    private String name;
    private String pinyinName;


    public City() {
    }

    public City(Integer id, String name, String pinyinName) {
        this.id = id;
        this.name = name;
        this.pinyinName = pinyinName;
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
     * @return pinyinName
     */
    public String getPinyinName() {
        return pinyinName;
    }

    /**
     * 设置
     * @param pinyinName
     */
    public void setPinyinName(String pinyinName) {
        this.pinyinName = pinyinName;
    }

    public String toString() {
        return "City{id = " + id + ", name = " + name + ", pinyinName = " + pinyinName + "}";
    }
}
