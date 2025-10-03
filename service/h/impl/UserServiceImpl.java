package cn.kgc.service.h.impl;

import cn.kgc.entity.h.Users;
import cn.kgc.mapper.h.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.kgc.service.h.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    public Users loginUser(String phone, String passwordHash) {
        return usersMapper.loginUser(phone, passwordHash);
    }

    public Boolean registerUser(Users user) {
        return usersMapper.addUser(user) > 0;
    }

    public Boolean checkPhone(String phone) {
        return usersMapper.selectPhone(phone) > 0;
    }

    public Boolean changePwd(String phone, String newPasswordHash) {
        return usersMapper.updatePwd(phone, newPasswordHash) > 0;
    }

    public Boolean changeKxiMoney(Integer id, Integer kxiMoney) {
        return usersMapper.updateKxiMoney(id, kxiMoney) > 0;
    }
}
