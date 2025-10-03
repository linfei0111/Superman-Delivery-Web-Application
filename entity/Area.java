package cn.kgc.entity;

import java.io.Serializable;

public class Area implements Serializable {

    private Integer id;

    private String name;

    private Integer cityId;

    public Area() {
    }

    public Area(Integer id, String name, Integer cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
