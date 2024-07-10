package com.cdtu.mapper;


import com.cdtu.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User queryByOpenid(String openid);
    User queryByOpenid1(String openid);
    int insert(User User);
    int update(User User);
}
