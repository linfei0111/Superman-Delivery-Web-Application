package cn.kgc.service.h.impl;

import cn.kgc.entity.h.GiftInfo;
import cn.kgc.mapper.h.GiftInfoMapper;
import cn.kgc.service.h.GiftInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GiftInfoServiceImpl implements GiftInfoService {
    @Autowired
    private GiftInfoMapper giftInfoMapper;
    public List<GiftInfo> giftInfoList(Integer uid) {
        return giftInfoMapper.getGiftInfo(uid);
    }

    public Boolean addGiftInfo(GiftInfo giftInfo) {
        return giftInfoMapper.insertGiftInfo(giftInfo) > 0;
    }
}
