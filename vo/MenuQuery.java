package cn.kgc.vo;

public class MenuQuery {

    private String menuName;

    private Integer categoryId;

    public MenuQuery() {
    }

    public MenuQuery(String menuName, Integer categoryId) {
        this.menuName = menuName;
        this.categoryId = categoryId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
