package cn.kgc.controller.huang;

import cn.kgc.entity.h.GiftInfo;
import cn.kgc.entity.h.Users;
import cn.kgc.service.h.GiftInfoService;
import cn.kgc.service.h.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Date;

@Controller
@RequestMapping("giftInfo")
public class GiftInfoController {
    @Autowired
    private GiftInfoService giftInfoService;
    @Autowired
    private UserService userService;
    @RequestMapping("giftInfoList")
    @ResponseBody
    public Boolean addGiftInfo(String giftName, String userName,String phone, String address, HttpSession session,Integer giftPrice){
        Users user = (Users) session.getAttribute("user");
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftName(giftName);
        giftInfo.setUserName(userName);
        giftInfo.setPhone(phone);
        giftInfo.setAddress(address);
        giftInfo.setUid(user.getId());
        giftInfo.setGiftDate(new Date(System.currentTimeMillis()));
        giftInfo.setResult("审核中");
        return giftInfoService.addGiftInfo(giftInfo)&&userService.changeKxiMoney(user.getId(),0-giftPrice);
    }
}
