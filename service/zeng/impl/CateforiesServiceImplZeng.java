package cn.kgc.service.zeng.impl;
import cn.kgc.entity.Categories;
import cn.kgc.mapper.zeng.CateForiesMapperZeng;
import cn.kgc.service.zeng.CateforiesServiceZeng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateforiesServiceImplZeng implements CateforiesServiceZeng {
    @Autowired
    private CateForiesMapperZeng cateForiesMapper;
    @Override
    public List<Categories> selectCatefories() {
        return cateForiesMapper.selectCateFories();
    }

    @Override
    public List<Categories> allSelect() {
        return cateForiesMapper.allSelectCategories();
    }
}
