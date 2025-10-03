package cn.kgc.mapper.h;

import cn.kgc.entity.h.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    public Users loginUser(@Param("phone") String phone,@Param("passwordHash") String passwordHash);
    public int addUser(Users users);
    public int selectPhone(@Param("phone") String phone);
    public int updatePwd(@Param("phone") String phone,@Param("passwordHash") String passwordHash);
    public int updateKxiMoney(@Param("id") Integer id,@Param("KxiMoney") Integer KxiMoney);
}
