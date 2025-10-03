package cn.kgc.service.zeng.impl;

import cn.kgc.entity.Menu;
import cn.kgc.mapper.zeng.MenuMapperZeng;
import cn.kgc.service.zeng.MenuServiceZeng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImplZeng implements MenuServiceZeng {
    @Autowired
    private MenuMapperZeng menuMapper;
    @Override
    public List<Menu> selectMenu() {
        return menuMapper.selectMemuList();
    }

    @Override
    public List<Menu> selectMenuByCategoryId(Integer categoryId) {
        return menuMapper.selectMenuByCategoryId(categoryId);
    }
}
