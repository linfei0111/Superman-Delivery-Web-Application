package cn.kgc.mapper.h;

import cn.kgc.entity.h.GiftInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftInfoMapper {
    public List<GiftInfo> getGiftInfo(@Param("uid") Integer uid);
    public int insertGiftInfo(GiftInfo giftInfo);
}
