package com.cdtu.mapper;

import com.cdtu.model.Good;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.model.user_good;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User_GoodMapper {
    int insert(user_good user_good);
    List<user_good> queryByCode(user_good user_good);
}
