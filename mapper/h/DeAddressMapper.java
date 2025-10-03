package cn.kgc.mapper.h;

import cn.kgc.entity.h.DeAddress;

import java.util.List;

public interface DeAddressMapper {
    public int addDeAddress(DeAddress address);
    public List<DeAddress> getDeAddressList(Integer userId);
    public int updateDeAddress(DeAddress address);
    public int deleteDeAddress(Integer id);
}
