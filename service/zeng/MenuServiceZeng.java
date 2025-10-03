package cn.kgc.service.zeng;

import cn.kgc.entity.Menu;

import java.util.List;

public interface MenuServiceZeng {
    public List<Menu> selectMenu();
    public List<Menu> selectMenuByCategoryId(Integer categoryId);


}
