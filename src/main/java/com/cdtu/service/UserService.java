package com.cdtu.service;

import com.cdtu.model.User;
import com.cdtu.utils.Result;

public interface UserService {
    Result login(String code,String avatarURL,String nickName);
    Result queryByOpenid(String openid);
    Result insert(User User);
    Result update(User User);
}
