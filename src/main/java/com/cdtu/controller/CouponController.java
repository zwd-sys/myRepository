package com.cdtu.controller;

import com.cdtu.model.User;
import com.cdtu.service.CouponService;
import com.cdtu.service.UserService;
import com.cdtu.service.impl.UserServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class CouponController {
    @Autowired
    CouponService CouponService;
    @Autowired
    UserServiceImpl UserServiceImpl;
    @RequestMapping("/insertcoupon")
    @ResponseBody
    public Object insertCoupon(int id,int coupon_value,String openId){
        int coupon_id=CouponService.queryByVal(coupon_value).getCouponId();
        CouponService.insertCoupon(id,coupon_id);
        Result result= UserServiceImpl.queryByOpenid(openId);
        System.out.println(result);//查询有问题
        return result;
    }

}
