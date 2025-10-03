package cn.kgc.service.h;

import cn.kgc.entity.h.City;

import java.util.List;

public interface CityService {
    public List<City> showCityList();
    public int selectId(String cityName);
}
