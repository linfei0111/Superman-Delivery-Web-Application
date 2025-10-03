package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Brands;
import cn.kgc.mapper.h.BrandsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.BrandsService;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandsService{
    @Autowired
    private BrandsMapper brandsMapper;

    public List<Brands> showBrands() {
        return brandsMapper.getBrands();
    }
}
