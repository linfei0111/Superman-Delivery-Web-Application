package cn.kgc.controller.xiao;

import cn.kgc.entity.Gift;
import cn.kgc.entity.h.GiftInfo;
import cn.kgc.entity.h.Users;
import cn.kgc.service.h.GiftInfoService;
import cn.kgc.service.xiao.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/gift")
public class GiftController {

    @Autowired
    private GiftService giftService;
    @Autowired
    private GiftInfoService giftInfoService;

    @RequestMapping("/show")
    public String showGifts(Model model, HttpSession session){
        Users user = (Users) session.getAttribute("user");
        List<Gift> giftList = giftService.selectGiftList();
        List<GiftInfo> giftInfoList = giftInfoService.giftInfoList(user.getId());
        model.addAttribute("giftList",giftList);
        model.addAttribute("giftInfoList",giftInfoList);
        model.addAttribute("ok",giftInfoList.size()>0);
        return "gifts";
    }
}
