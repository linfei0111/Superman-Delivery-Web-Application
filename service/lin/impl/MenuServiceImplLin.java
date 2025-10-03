package cn.kgc.service.lin.impl;

import cn.kgc.entity.Menu;
import cn.kgc.mapper.lin.MenuMapperLin;
import cn.kgc.service.lin.MenuServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImplLin implements MenuServiceLin {

    @Autowired
    private MenuMapperLin menuMapperLin;

    @Override
    public Menu getMenu(int menuId) {
        return menuMapperLin.getMenuById(menuId);
    }
}
