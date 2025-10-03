package cn.kgc.controller.h;

import cn.kgc.entity.h.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.kgc.service.h.DeAddressService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/deAddress")
public class DeAddressController {
    @Autowired
    private DeAddressService deAddressService;
    @RequestMapping("/toAdd")
    public String toAdd(Model model,HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        Integer userId =  user.getId();
        model.addAttribute("deAddressList",deAddressService.getAllDeAddress(userId));
        return "member_addr";
    }
    @RequestMapping("/add")
    public Map<String,Boolean> addDeAddress(String name, String phone, String address, HttpSession session){
        Users user = (Users) session.getAttribute("user");
        Boolean b = deAddressService.addDeAddress(name, phone, address, user.getId());
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("success",b);
        return map;
    }
    @RequestMapping("/update")
    public Map<String,Boolean> addDeAddress(String name, String phone, String address,Integer id){
        Boolean b = deAddressService.modifyDeAddress(name, phone, address, id);
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("success",b);
        return map;
    }
    @RequestMapping("/remove")
    public Map<String,Boolean> removeDeAddress(Integer id){
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("success",deAddressService.deleteDeAddress(id));
        return map;
    }
}
