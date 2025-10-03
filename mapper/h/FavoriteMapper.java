package cn.kgc.mapper.h;

import org.apache.ibatis.annotations.Param;
import cn.kgc.vo.h.Favorite;

import java.util.List;

public interface FavoriteMapper {
    public List<Favorite> getFavorites(@Param("userId") Integer userId);
    public int deleteFavorite( @Param("id") Integer id);
}
