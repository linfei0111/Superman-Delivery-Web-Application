package cn.kgc.mapper.xiao;

import cn.kgc.entity.Categories;
import cn.kgc.entity.Menu;
import cn.kgc.entity.h.Brands;
import cn.kgc.entity.h.City;
import cn.kgc.entity.h.Restaurants;
import cn.kgc.entity.h.Users;
import cn.kgc.vo.BrandsQuery;
import cn.kgc.vo.MenuQuery;
import cn.kgc.vo.RestaurantsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {

    public Users selectUser(@Param("username") String username,
                            @Param("passwordHash") String passwordHash);

    public List<Menu> selectMenuList(@Param("menuQuery")MenuQuery menuQuery,
                                     @Param("pageId") Integer pageId,
                                     @Param("pageSize") Integer pageSize);

    public int selectMenuRows(@Param("menuQuery")MenuQuery menuQuery);

    public Categories selectCategoryById(Integer id);

    public List<Categories> selectCategoryList();

    public int insertSelective(Menu menu);

    public Menu selectMenuById(Integer menuId);

    public int updateMenuById(Menu menu);

    public int deleteMenuById(Integer menuId);

    public List<Brands> selectBrandList(@Param("brandsQuery") BrandsQuery brandsQuery,
                                        @Param("pageId") Integer pageId,
                                        @Param("pageSize") Integer pageSize);

    public int selectBrandsRows(@Param("brandsQuery") BrandsQuery brandsQuery);

    public int insertSelective2(Brands brands);

    public Brands selectBrandById(Integer id);

    public int updateBrandById(Brands brands);

    public int deleteBrandById(Integer id);

    public List<Restaurants> selectRestaurantsList(@Param("restaurantsQuery") RestaurantsQuery restaurantsQuery,
                                                   @Param("pageId") Integer pageId,
                                                   @Param("pageSize") Integer pageSize);

    public int selectRestaurantsRows(@Param("restaurantsQuery") RestaurantsQuery restaurantsQuery);


    public List<Brands> selectBrands();

    public int insertSelective3(Restaurants restaurants);

    public Restaurants selectRestaurantById(Integer id);

    public int updateRestaurantById(Restaurants restaurants);

    public int deleteRestaurantById(Integer id);

    public List<City> selectCityList();
}
