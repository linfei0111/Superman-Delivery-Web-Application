package cn.kgc.service.h;

import cn.kgc.entity.h.GiftInfo;

import java.util.List;

public interface GiftInfoService {
    public List<GiftInfo> giftInfoList(Integer uid);
    public Boolean addGiftInfo(GiftInfo giftInfo);
}
