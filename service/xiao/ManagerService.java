package cn.kgc.service.xiao;

import cn.kgc.entity.Categories;
import cn.kgc.entity.Menu;
import cn.kgc.entity.h.Brands;
import cn.kgc.entity.h.City;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.entity.h.Users;
import cn.kgc.util.xiao.PageBean;
import cn.kgc.vo.BrandsQuery;
import cn.kgc.vo.MenuQuery;
import cn.kgc.vo.RestaurantsQuery;

import java.util.List;

public interface ManagerService {

    public Users login(String username, String passwordHash);

    public PageBean<Menu> getPageMenu(MenuQuery menuQuery,Integer pageId);

    public List<Categories> getCategoryList();

    public Boolean addMenu(Menu menu);

    public Menu getMenuById(Integer menuId);

    public Boolean modifyMenuById(Menu menu);

    public Boolean removeMenuById(Integer menuId);

    public PageBean<Brands> getPageBrands(BrandsQuery brandsQuery, Integer pageId);

    public Boolean addBrands(Brands brands);

    public Brands getBrandById(Integer id);

    public Boolean modifyBrandById(Brands brands);

    public Boolean removeBrandById(Integer id);

    public PageBean<Restaurants> getPageRestaurants(RestaurantsQuery restaurantsQuery, Integer pageId);

    public List<Brands> getBrandsList();

    public Boolean addRestaurants(Restaurants restaurants);

    public Restaurants getRestaurantById(Integer id);

    public Boolean modifyRestaurantById(Restaurants restaurants);

    public Boolean removeRestaurantById(Integer id);

    public List<City> getCityList();
}
