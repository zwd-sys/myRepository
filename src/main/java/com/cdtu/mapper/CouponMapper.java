package com.cdtu.mapper;

import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CouponMapper {
    List<coupon> queryByOpenid(String openid);
    int insertCoupon(user_coupon user_coupon);
    coupon queryByVal(int coupon_value);
    int delete(int cid);
}
