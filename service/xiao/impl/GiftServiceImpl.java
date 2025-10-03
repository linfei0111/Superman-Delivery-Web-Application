package cn.kgc.service.xiao.impl;

import cn.kgc.entity.Gift;
import cn.kgc.mapper.xiao.GiftMapper;
import cn.kgc.service.xiao.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    private GiftMapper giftMapper;


    @Override
    public List<Gift> selectGiftList() {
        List<Gift> giftList = giftMapper.selectGiftList();
        return giftList;
    }
}
