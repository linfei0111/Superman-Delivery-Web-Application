package cn.kgc.mapper.h;

import cn.kgc.entity.h.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    public List<City> getCityList();
    public int selectId(@Param("cityName") String cityName);
}
