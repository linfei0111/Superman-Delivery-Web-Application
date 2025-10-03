package cn.kgc.service.h.impl;

import cn.kgc.entity.h.City;
import cn.kgc.mapper.h.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.CityService;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    public List<City> showCityList() {
        return cityMapper.getCityList();
    }

    public int selectId(String cityName) {
        return cityMapper.selectId(cityName);
    }


}
