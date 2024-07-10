package com.cdtu.service;

import com.cdtu.model.User;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.utils.Result;

import java.util.List;

public interface CouponService {
    List<coupon> queryByOpenid(String openid);
    Result insertCoupon(int id,int coupon_id);
    coupon queryByVal(int coupon_value);
    Result delete(int cid);
}
