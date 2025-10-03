package cn.kgc.mapper.zeng;

import cn.kgc.entity.Menu;

import java.util.List;

public interface MenuMapperZeng {
    public List<Menu> selectMemuList();
    List<Menu> selectMenuByCategoryId(Integer categoryId);


}
