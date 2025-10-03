package cn.kgc.service.lin.impl;

import cn.kgc.entity.h.Brands;
import cn.kgc.mapper.lin.BrandsMapperLin;
import cn.kgc.service.lin.BrandsServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrandServiceImplLin implements BrandsServiceLin {
    @Autowired
    private BrandsMapperLin brandsMapperLin;

    public Brands getBrandById(int id) {
        return brandsMapperLin.getBrandById(id);
    }
}
