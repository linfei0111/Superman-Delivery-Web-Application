package cn.kgc.service.h;

import cn.kgc.entity.h.Users;

public interface UserService {
    public Users loginUser(String phone, String passwordHash);
    public Boolean registerUser(Users user);
    public Boolean checkPhone(String phone);
    public Boolean changePwd(String phone,String newPasswordHash);
    public Boolean changeKxiMoney(Integer id, Integer kxiMoney);

}
