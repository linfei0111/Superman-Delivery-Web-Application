package cn.kgc.service.h;


import cn.kgc.entity.h.DeAddress;

import java.util.List;

public interface DeAddressService {
    public Boolean addDeAddress(String name, String phone, String address,Integer userId);
    public List<DeAddress> getAllDeAddress(Integer userId);
    public Boolean modifyDeAddress(String name, String phone, String address,Integer id);
    public Boolean deleteDeAddress(Integer id);
}
