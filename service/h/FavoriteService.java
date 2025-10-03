package cn.kgc.service.h;

import cn.kgc.vo.h.Favorite;

import java.util.List;

public interface FavoriteService {
    public List<Favorite> getFavorites(Integer userId);
    public Boolean deleteFavorite(Integer id);
}
