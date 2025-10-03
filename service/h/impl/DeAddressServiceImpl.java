package cn.kgc.service.h.impl;

import cn.kgc.entity.h.DeAddress;
import cn.kgc.mapper.h.DeAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.DeAddressService;

import java.sql.Date;
import java.util.Collections;
import java.util.List;

@Service
public class DeAddressServiceImpl implements DeAddressService {
    @Autowired
    private DeAddressMapper deAddressMapper;
    public Boolean addDeAddress(String name, String phone, String address,Integer userId) {
        DeAddress deAddress = new DeAddress(null,userId,name,phone,address,false,new Date(System.currentTimeMillis()),null);
        return deAddressMapper.addDeAddress(deAddress) > 0;
    }

    public List<DeAddress> getAllDeAddress(Integer userId) {
        return deAddressMapper.getDeAddressList(userId);
    }

    public Boolean modifyDeAddress(String name, String phone, String address, Integer id) {
        DeAddress deAddress = new DeAddress(id,null,name,phone,address,null,null,new Date(System.currentTimeMillis()));
        return deAddressMapper.updateDeAddress(deAddress) > 0;
    }

    public Boolean deleteDeAddress(Integer id) {
        return deAddressMapper.deleteDeAddress(id) > 0;
    }
}
