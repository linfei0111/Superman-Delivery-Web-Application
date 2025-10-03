package cn.kgc.service.h.impl;

import cn.kgc.mapper.h.FavoriteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.FavoriteService;
import cn.kgc.vo.h.Favorite;

import java.util.List;
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    private FavoriteMapper favoriteMapper;
    public List<Favorite> getFavorites(Integer userId) {
        return favoriteMapper.getFavorites(userId);
    }

    public Boolean deleteFavorite(Integer id) {
        return favoriteMapper.deleteFavorite(id) > 0;
    }
}
