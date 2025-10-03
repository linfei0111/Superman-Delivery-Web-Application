package cn.kgc.controller.xiao;


import cn.kgc.entity.Categories;
import cn.kgc.entity.Menu;
import cn.kgc.entity.h.Brands;
import cn.kgc.entity.h.City;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.entity.h.Users;
import cn.kgc.service.xiao.ManagerService;
import cn.kgc.service.xiao.RestaurantsService3;
import cn.kgc.util.xiao.PageBean;
import cn.kgc.vo.BrandsQuery;
import cn.kgc.vo.MenuQuery;
import cn.kgc.vo.RestaurantsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private RestaurantsService3 restaurantsService;


    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/jsp2/login";
    }


    @RequestMapping("/login")
    public String login(String username, String passwordHash, RedirectAttributes attributes,HttpSession session,Model model){
        Users loginUser = managerService.login(username,passwordHash);
        if (loginUser != null){
            session.setAttribute("loginUser",loginUser);
            return "/jsp2/frame";
        }else {
            attributes.addFlashAttribute("error","账户名或密码错误");
            return "redirect:/manager/toLogin";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/manager/toLogin";
    }


    @RequestMapping("/shop")
    public String showPageMenu(MenuQuery menuQuery,
                               @RequestParam(defaultValue = "1") Integer pageId,
                               Model model){
        List<Categories> categoriesList = managerService.getCategoryList();
        PageBean<Menu> pageBean = managerService.getPageMenu(menuQuery,pageId);
        model.addAttribute("categoriesList",categoriesList);
        model.addAttribute("pageBean",pageBean);

        return "/jsp2/user/userlist";
    }


    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        List<Categories> categoriesList = managerService.getCategoryList();
        List<Restaurants> restaurantsList = restaurantsService.selectRestaurants();
        model.addAttribute("categoriesList",categoriesList);
        model.addAttribute("restaurantsList",restaurantsList);
        return "/jsp2/user/useradd";
    }


    @RequestMapping("/add")
    public String add(Menu menu){
        managerService.addMenu(menu);
        return "redirect:/manager/shop";
    }

    @RequestMapping("/info")
    public String showMenu(Integer menuId,Model model){
        Menu menu = managerService.getMenuById(menuId);
        List<Categories> categoriesList = managerService.getCategoryList();
        model.addAttribute("menu",menu);
        model.addAttribute("categoriesList",categoriesList);
        return "jsp2/user/usermodify";
    }

    @RequestMapping("/info/{id}")
    @ResponseBody
    public Menu showMenuInfo(@PathVariable("menuId") Integer menuId){
        Menu menu = managerService.getMenuById(menuId);
        return menu;
    }


    @RequestMapping("/modify")
    public String modifyMenu(Menu menu){
        managerService.modifyMenuById(menu);
        return "redirect:/manager/shop";
    }


    @RequestMapping("/remove/{menuId}")
    @ResponseBody
    public Map<String, Boolean> removeMenu(@PathVariable("menuId") Integer menuId){
        Boolean success = managerService.removeMenuById(menuId);
        Map<String,Boolean> map = new HashMap<>();
        map.put("success",success);
        return map;
    }

    @RequestMapping("/brand")
    public String showPageBrands(BrandsQuery brandsQuery,
                                 @RequestParam(defaultValue = "1") Integer pageId,
                                 Model model){
        PageBean<Brands> pageBean = managerService.getPageBrands(brandsQuery,pageId);
        model.addAttribute("pageBean",pageBean);

        return "/jsp2/user/userlist2";
    }

    @RequestMapping("/toAddBrand")
    public String toAddBrand(){
        return "/jsp2/user/useradd2";
    }

    @RequestMapping("/addBrand")
    public String addBrand(Brands brands){
        managerService.addBrands(brands);
        return "redirect:/manager/brand";
    }

    @RequestMapping("/brandInfo")
    public String showBrands(Integer id,Model model){
        Brands brands = managerService.getBrandById(id);
        model.addAttribute("brands",brands);
        return "jsp2/user/usermodify2";
    }

    @RequestMapping("/brandInfo/{id}")
    public Brands showBrandInfo(@PathVariable("id") Integer id){
        Brands brands = managerService.getBrandById(id);
        return brands;
    }

    @RequestMapping("/modifyBrand")
    public String modifyBrand(Brands brands){
        managerService.modifyBrandById(brands);
        return "redirect:/manager/brand";
    }

    @RequestMapping("/removeBrand/{id}")
    @ResponseBody
    public Map<String, Boolean> removeBrand(@PathVariable("id") Integer id){
        Boolean success = managerService.removeBrandById(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("success",success);
        return map;
    }

    @RequestMapping("/restaurant")
    public String showPageRestaurant(RestaurantsQuery restaurantsQuery,
                                     @RequestParam(defaultValue = "1") Integer pageId,
                                     Model model){
        List<Brands> brandsList = managerService.getBrandsList();
        PageBean<Restaurants> pageBean = managerService.getPageRestaurants(restaurantsQuery, pageId);
        model.addAttribute("brandsList",brandsList);
        model.addAttribute("pageBean",pageBean);
        return "/jsp2/user/userlist3";
    }

    @RequestMapping("/toAddRestaurant")
    public String toAddRestaurant(Model model){
        List<Brands> brandsList = managerService.getBrandsList();
        List<City> cityList = managerService.getCityList();
        model.addAttribute("brandsList",brandsList);
        model.addAttribute("cityList",cityList);
        return "/jsp2/user/useradd3";
    }

    @RequestMapping("/addRestaurant")
    public String addRestaurant(Restaurants restaurants){
        managerService.addRestaurants(restaurants);
        return "redirect:/manager/restaurant";
    }

    @RequestMapping("/restaurantInfo")
    public String showRestaurants(Integer id,Model model){
        Restaurants restaurants = managerService.getRestaurantById(id);
        List<Brands> brandsList = managerService.getBrandsList();
        model.addAttribute("restaurants",restaurants);
        model.addAttribute("brandsList",brandsList);
        return "jsp2/user/usermodify3";
    }

    @RequestMapping("/restaurantInfo/{id}")
    @ResponseBody
    public Restaurants showRestaurantInfo(@PathVariable("id") Integer id){
        Restaurants restaurants = managerService.getRestaurantById(id);
        return restaurants;
    }

    @RequestMapping("/modifyRestaurant")
    public String modifyRestaurant(Restaurants restaurants){
        managerService.modifyRestaurantById(restaurants);
        return "redirect:/manager/restaurant";
    }

    @RequestMapping("/removeRestaurant/{id}")
    @ResponseBody
    public Map<String, Boolean> removeRestaurant(@PathVariable("id") Integer id){
        Boolean success = managerService.removeRestaurantById(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("success",success);
        return map;
    }
}
