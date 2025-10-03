package cn.kgc.service.lin;

import cn.kgc.entity.h.DeAddress;

import java.util.List;

public interface AddressServiceLin {
    public List<DeAddress> addressList(Integer userId);
    public boolean addAddress(DeAddress address);
    public DeAddress getAddressById(Integer id);
    public boolean updateAddress(DeAddress address);
    public boolean deleteAddress(Integer id);
}
