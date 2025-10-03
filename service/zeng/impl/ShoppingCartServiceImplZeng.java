package cn.kgc.service.zeng.impl;

import cn.kgc.entity.ShoppingCart;
import cn.kgc.mapper.zeng.ShoppingCartMapperZeng;
import cn.kgc.service.zeng.ShoppingCartServiceZeng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImplZeng implements ShoppingCartServiceZeng {
    @Autowired
    private ShoppingCartMapperZeng shoppingCartMapper;
    @Override
    public Boolean addShoppingCart(ShoppingCart shoppingCart) {
        return  shoppingCartMapper.insertShoppingCart(shoppingCart)>0;
    }
}
