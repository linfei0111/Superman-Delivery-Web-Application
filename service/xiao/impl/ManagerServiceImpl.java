package cn.kgc.service.xiao.impl;

import cn.kgc.entity.Categories;
import cn.kgc.entity.Menu;
import cn.kgc.entity.h.Brands;
import cn.kgc.entity.h.City;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.entity.h.Users;
import cn.kgc.mapper.xiao.ManagerMapper;
import cn.kgc.service.xiao.ManagerService;

import cn.kgc.util.xiao.PageBean;
import cn.kgc.vo.BrandsQuery;
import cn.kgc.vo.MenuQuery;
import cn.kgc.vo.RestaurantsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;


    @Override
    public Users login(String username, String passwordHash) {
        return managerMapper.selectUser(username,passwordHash);
    }

    @Override
    public PageBean<Menu> getPageMenu(MenuQuery menuQuery, Integer pageId) {
        PageBean<Menu> pageBean = new PageBean<>();
        pageBean.setPageId(pageId);
        List<Menu> menuList = managerMapper.selectMenuList(menuQuery,pageBean.getPageId(),pageBean.getPageSize());
        for (Menu menu : menuList) {
            menu.setCategories(managerMapper.selectCategoryById(menu.getCategoryId()));
        }
        pageBean.setResult(menuList);
        pageBean.setTotalRows(managerMapper.selectMenuRows(menuQuery));
        return pageBean;
    }

    @Override
    public List<Categories> getCategoryList() {
        return managerMapper.selectCategoryList();
    }


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean addMenu(Menu menu) {
        return managerMapper.insertSelective(menu) > 0;
    }


    @Override
    public Menu getMenuById(Integer menuId) {
        Menu menu = managerMapper.selectMenuById(menuId);
        menu.setCategories(managerMapper.selectCategoryById(menu.getCategoryId()));
        return menu;
    }

    @Transactional
    public Boolean modifyMenuById(Menu menu) {
        return managerMapper.updateMenuById(menu) > 0;
    }

    @Transactional
    public Boolean removeMenuById(Integer menuId) {
        return managerMapper.deleteMenuById(menuId) > 0;
    }

    @Override
    public PageBean<Brands> getPageBrands(BrandsQuery brandsQuery, Integer pageId) {
        PageBean<Brands> pageBean = new PageBean<>();
        pageBean.setPageId(pageId);
        List<Brands> brandsList = managerMapper.selectBrandList(brandsQuery,pageBean.getPageId(),pageBean.getPageSize());
        pageBean.setResult(brandsList);
        pageBean.setTotalRows(managerMapper.selectBrandsRows(brandsQuery));
        return pageBean;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean addBrands(Brands brands) {
        return managerMapper.insertSelective2(brands) > 0;
    }

    @Override
    public Brands getBrandById(Integer id) {
        Brands brands = managerMapper.selectBrandById(id);
        return brands;
    }

    @Transactional
    public Boolean modifyBrandById(Brands brands) {
        return managerMapper.updateBrandById(brands) > 0;
    }

    @Transactional
    public Boolean removeBrandById(Integer id) {
        return managerMapper.deleteBrandById(id) > 0;
    }

    @Override
    public PageBean<Restaurants> getPageRestaurants(RestaurantsQuery restaurantsQuery, Integer pageId) {
        PageBean<Restaurants> pageBean = new PageBean<>();
        pageBean.setPageId(pageId);
        List<Restaurants> restaurantsList = managerMapper.selectRestaurantsList(restaurantsQuery,pageBean.getPageId(),pageBean.getPageSize());
        for (Restaurants restaurants : restaurantsList) {
            restaurants.setBrands(managerMapper.selectBrandById(restaurants.getBrandId()));
        }
        pageBean.setResult(restaurantsList);
        pageBean.setTotalRows(managerMapper.selectRestaurantsRows(restaurantsQuery));
        return pageBean;
    }

    @Override
    public List<Brands> getBrandsList() {
        return managerMapper.selectBrands();
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
    @Override
    public Boolean addRestaurants(Restaurants restaurants) {
        return managerMapper.insertSelective3(restaurants) > 0;
    }

    @Override
    public Restaurants getRestaurantById(Integer id) {
        return managerMapper.selectRestaurantById(id);
    }

    @Transactional
    public Boolean modifyRestaurantById(Restaurants restaurants) {
        return managerMapper.updateRestaurantById(restaurants) > 0;
    }

    @Transactional
    public Boolean removeRestaurantById(Integer id) {
        return managerMapper.deleteRestaurantById(id) > 0;
    }

    @Override
    public List<City> getCityList() {
        return managerMapper.selectCityList();
    }
}
