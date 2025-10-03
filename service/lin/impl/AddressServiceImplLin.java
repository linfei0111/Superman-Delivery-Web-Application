package cn.kgc.service.lin.impl;

import cn.kgc.entity.h.DeAddress;
import cn.kgc.mapper.lin.AddressMapperLin;
import cn.kgc.service.lin.AddressServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImplLin implements AddressServiceLin {

    @Autowired
    private AddressMapperLin addressMapperLin;


    @Override
    public List<DeAddress> addressList(Integer user_id) {
        return addressMapperLin.showAddresses(user_id);
    }

    @Override
    public boolean addAddress(DeAddress address) {
        return addressMapperLin.addAddress(address)>0;
    }

    @Override
    public DeAddress getAddressById(Integer id) {
        DeAddress deAddress = addressMapperLin.selectAddressById(id);
        return deAddress;
    }

    @Override
    public boolean updateAddress(DeAddress address) {
        return addressMapperLin.updateAddressById(address)>0;
    }

    @Override
    public boolean deleteAddress(Integer id) {
        return addressMapperLin.deleteAddressById(id)>0;
    }
}
