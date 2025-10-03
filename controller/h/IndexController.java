package cn.kgc.controller.h;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "redirect:/user/toLogin";
    }
    @RequestMapping("/index/member_index")
    public String member_collect(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "member_index";
        }else{
            return "redirect:/user/toLogin";
        }

    }
}
