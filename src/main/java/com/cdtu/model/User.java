package com.cdtu.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private int id;
    private int exp;
    private int point;
    private int level;
    private String openId;
    private String userName;
    private String avatarURL;
    private String phone;
    private String sex;
    private List<coupon> couponList;
    private Date birthday;
    String birthdaytime;
    String address;
    public User() {
    }
    public User(String openId, String avatarURL, String nickName,int exp, int point, int level) {
        this.openId=openId;
        this.avatarURL=avatarURL;
        this.userName=nickName;
        this.exp = exp;
        this.point = point;
        this.level = level;
    }
}
