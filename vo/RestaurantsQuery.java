package cn.kgc.vo;

public class RestaurantsQuery {

    private String name;

    private Integer brandId;

    public RestaurantsQuery() {
    }

    public RestaurantsQuery(String name, Integer brandId) {
        this.name = name;
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
