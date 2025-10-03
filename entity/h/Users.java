package cn.kgc.entity.h;

import java.io.Serializable;
import java.sql.Date;

public class Users implements Serializable {
    private Integer id;
    private String username;
    private String email;
    private String passwordHash;
    private String phone;
    private Date registrationDate;
    private Date lastLogin;
    private Integer kxiMoney;
    public Integer getKxiMoney() {
        return kxiMoney;
    }

    public void setKxiMoney(Integer kxiMoney) {
        this.kxiMoney = kxiMoney;
    }

    public Users() {
    }

    public Users(Integer kxiMoney,Integer id, String username, String email, String passwordHash, String phone, Date registrationDate, Date lastLogin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.phone = phone;
        this.registrationDate = registrationDate;
        this.lastLogin = lastLogin;
        this.kxiMoney = kxiMoney;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return passwordHash
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * 设置
     * @param passwordHash
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return registrationDate
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * 设置
     * @param registrationDate
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * 获取
     * @return lastLogin
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String toString() {
        return "Users{id = " + id + ", username = " + username + ", email = " + email + ", passwordHash = " + passwordHash + ", phone = " + phone + ", registrationDate = " + registrationDate + ", lastLogin = " + lastLogin + "}";
    }
}
