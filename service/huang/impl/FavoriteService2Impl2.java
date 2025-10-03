package cn.kgc.service.huang.impl;

import cn.kgc.mapper.huang.FavoriteMapper2;
import cn.kgc.service.huang.FavoriteService2;
import cn.kgc.vo.h.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService2Impl2 implements FavoriteService2 {
    @Autowired
    private FavoriteMapper2 favoriteMapper2;

    public Boolean insertFavorite(Favorite favorite) {
        return favoriteMapper2.insertFavorite(favorite) > 0;
    }

    public Boolean deleteFavorite(int rid, int userId) {
        return favoriteMapper2.deleteFavorite(rid, userId) > 0;
    }

    public Boolean isFavorite(int rid, int userId) {
        return favoriteMapper2.selectFavorite(rid, userId) > 0;
    }
}
