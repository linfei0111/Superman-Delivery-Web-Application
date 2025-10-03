package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Repay;
import cn.kgc.mapper.h.RepayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.RepayService;
@Service
public class RepayServiceImpl implements RepayService {
    @Autowired
    private RepayMapper repayMapper;
    public Boolean addRepay(Repay repay) {
//        if("1".equals(repay.getRepayType())){
//
//        }
        return repayMapper.insertRepay(repay) > 0;
    }
}
