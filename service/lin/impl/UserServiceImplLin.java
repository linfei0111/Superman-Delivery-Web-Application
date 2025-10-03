package cn.kgc.service.lin.impl;

import cn.kgc.entity.h.Users;
import cn.kgc.mapper.lin.UserMapperLin;
import cn.kgc.service.lin.UserServiceLin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplLin implements UserServiceLin {

    @Autowired
    private UserMapperLin userMapperLin;

    @Override
    public Users getUserByUserId(int userId) {
        return userMapperLin.getUserByUserId(userId);
    }
}
