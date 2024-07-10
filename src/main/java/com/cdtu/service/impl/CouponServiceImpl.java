package com.cdtu.service.impl;


import com.cdtu.mapper.CouponMapper;
import com.cdtu.mapper.UserMapper;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.service.CouponService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    CouponMapper CouponMapper;
    @Override
    public List<coupon> queryByOpenid(String openid) {
        System.out.println("我是coupon的方法，openid="+openid);
        List<coupon> list=CouponMapper.queryByOpenid(openid);
        for(coupon coupon:list){
            System.out.println(coupon);
        }
        return list;
    }

    @Override
    public Result insertCoupon(int id, int coupon_id) {
        user_coupon user_coupon=new user_coupon();
        user_coupon.setCoupon_id(coupon_id);
        user_coupon.setUser_id(id);
        CouponMapper.insertCoupon(user_coupon);
        return new Result("200","添加成功",null);
    }

    @Override
    public coupon queryByVal(int coupon_value) {
        coupon coupon=CouponMapper.queryByVal(coupon_value);
        return coupon;
    }

    @Override
    public Result delete(int cid) {
        CouponMapper.delete(cid);
        return null;
    }
}
