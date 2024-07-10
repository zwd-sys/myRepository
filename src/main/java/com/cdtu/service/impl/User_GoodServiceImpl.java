package com.cdtu.service.impl;


import com.cdtu.mapper.CouponMapper;
import com.cdtu.mapper.User_GoodMapper;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.model.user_good;
import com.cdtu.service.CouponService;
import com.cdtu.service.User_GoodService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class User_GoodServiceImpl implements User_GoodService {
    @Autowired
    User_GoodMapper User_GoodMapper;
    @Override
    public Result insertCoupon(user_good user_good) {
        User_GoodMapper.insert(user_good);
        return new Result("200","添加成功",null);
    }

    @Override
    public Result queryByCode(user_good user_good) {
        List<user_good> list=User_GoodMapper.queryByCode(user_good);
//        for(user_good u:list){
//            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//            String date=ft.format(u.getGood_time());
//            ft.setLenient(true);
//            u.setXiadan_time(date);
//        }
        return new Result("200","查询成功",list);
    }
}
