package cn.kgc.service.huang;

import cn.kgc.vo.h.Favorite;

public interface FavoriteService2 {
    public Boolean insertFavorite(Favorite favorite);
    public Boolean deleteFavorite(int rid, int userId);
    public Boolean isFavorite(int rid, int userId);
}
