package cn.kgc.controller.lin;

import cn.kgc.entity.h.DeAddress;
import cn.kgc.entity.h.Users;
import cn.kgc.service.lin.AddressServiceLin;
import cn.kgc.service.lin.UserServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/address")
public class AddressControllerLin {

    @Autowired
    private AddressServiceLin addressServiceLin;
    @Autowired
    private UserServiceLin userServiceLin;

    @RequestMapping("/addressList")
    @ResponseBody
    public List<DeAddress> showAddressList(Model model, HttpSession session) {
        DeAddress deAddress = new DeAddress();
        Users user = (Users)session.getAttribute("user");
        deAddress.setUserId(user.getId());
        //Integer userId = 1;
        return addressServiceLin.addressList(user.getId());
    }

    @RequestMapping("/toAddressList")
    public String toAddress(Model model) {
        List<DeAddress> deAddressList = addressServiceLin.addressList(1);
        model.addAttribute("deAddressList", deAddressList);
        return "/order";
    }

    @RequestMapping("/toAddAddress")
    public String toAdd(){
        return "order";
    }

    @RequestMapping("/addAddress")
    @ResponseBody
    public Map<String,Object> addAddress(String customer_name, String customer_phone, String delivery_address, HttpSession session) {
        //参数转对象
        DeAddress deAddress = new DeAddress();
        Users user = (Users)session.getAttribute("user");
        deAddress.setUserId(user.getId());
        //deAddress.setUserId(1);
        deAddress.setReceiverName(customer_name);
        deAddress.setPhone(customer_phone);
        deAddress.setAddress(delivery_address);

        boolean success = addressServiceLin.addAddress(deAddress);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("status",success ? "ok" : "fail");
        return map;
    }

    @RequestMapping("/toEditAddress")
    @ResponseBody
    public Map<String, Object> toEditAddress(String customer_name, String customer_phone, String delivery_address,Integer id) {
        DeAddress deAddress = new DeAddress();
        deAddress.setReceiverName(customer_name);
        deAddress.setPhone(customer_phone);
        deAddress.setAddress(delivery_address);
        deAddress.setId(id);
        boolean success = addressServiceLin.updateAddress(deAddress);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("status",success ? "ok" : "fail");
        return map;
    }

    @RequestMapping("/toDeleteAddress")
    @ResponseBody
    public Map<String, Object> toDeleteAddress(Model model, Integer id) {
        boolean success = addressServiceLin.deleteAddress(id);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("status",success ? "ok" : "fail");
        return map;
    }



}
