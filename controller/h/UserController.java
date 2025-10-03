package cn.kgc.controller.h;

import cn.kgc.entity.h.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.kgc.service.h.BrandsService;
import cn.kgc.service.h.CityService;
import cn.kgc.service.h.UserService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CityService cityService;
    @Autowired
    private BrandsService brandsService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(String phone, String passwordHash, HttpSession session) {
        Users users = userService.loginUser(phone, passwordHash);
        Map<String, Object> map = new HashMap<String, Object>();
        if (users != null) {
            session.setAttribute("user", users);
            map.put("status", true);
        } else {
            map.put("status", false);
        }
        return map;
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/register")
    @ResponseBody
    public Map<String, Object> register(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ok", userService.registerUser(users));
        return map;
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/help")
    public String help() {
        return "help";
    }

    @RequestMapping("/jobs")
    public String jobs() {
        return "jobs";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/toIndex")
    public String toIndex(Model model) {
        model.addAttribute("cityList", cityService.showCityList());
        model.addAttribute("brandsList", brandsService.showBrands());
        return "index";
    }

    @RequestMapping("/forget")
    public String pwdForget() {
        return "pwd_forget";
    }

    @RequestMapping("/checkPhone")
    @ResponseBody
    public Map<String, Boolean> checkPhone(String phone) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("status", userService.checkPhone(phone));
        return map;
    }
    @RequestMapping("/resetPassword")
    public String resetPassword() {
        return "pwd_forget";
    }
    @RequestMapping("/reset/{phone}")
    public String resetPassword(@PathVariable("phone") String phone, String pass) {
        userService.changePwd(phone, pass);
        return "pwd_success";
    }
    @RequestMapping("/getNum")
    @ResponseBody
    public Map<String, Object> getNum() {
        Map<String, Object> map = new HashMap<String, Object>();
        Integer result = new Random().nextInt(9000)+1000;
        map.put("num", result);
        return map;
    }
    @RequestMapping("/toReset")
    public String toReset(String phone,Model model) {
        model.addAttribute("phone", phone);
        return "pwd_reset";
    }
}
