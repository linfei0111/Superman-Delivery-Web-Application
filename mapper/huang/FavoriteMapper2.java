package cn.kgc.mapper.huang;

import cn.kgc.vo.h.Favorite;
import org.apache.ibatis.annotations.Param;

public interface FavoriteMapper2 {
    public int insertFavorite(Favorite favorite);
    public int deleteFavorite(@Param("rid") int rid, @Param("userId") int userId);
    public int selectFavorite(@Param("rid") int rid, @Param("userId") int userId);
}
