package cn.kgc.mapper.lin;

import cn.kgc.entity.h.DeAddress;

import java.util.List;

public interface AddressMapperLin {
    public List<DeAddress> showAddresses(Integer userId);
    public int addAddress(DeAddress address);
    public DeAddress selectAddressById(Integer id);
    public int updateAddressById(DeAddress address);
    public int deleteAddressById(Integer id);
}
