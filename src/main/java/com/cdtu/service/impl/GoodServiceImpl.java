package com.cdtu.service.impl;


import com.cdtu.mapper.CouponMapper;
import com.cdtu.mapper.GoodMapper;
import com.cdtu.mapper.GoodTypeMapper;
import com.cdtu.model.Good;
import com.cdtu.model.GoodType;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.service.CouponService;
import com.cdtu.service.GoodService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodMapper GoodMapper;
    @Autowired
    GoodTypeMapper GoodTypeMapper;
    @Override
    public Result queryByName(String name) {
        System.out.println(name);
        List<GoodType> list=GoodTypeMapper.queryByName(name);
        List<Good> goodlist=new ArrayList<>();
        for(GoodType g:list){
            System.out.println(g);
            goodlist=g.getFoods();
        }
        return new Result("200","查询成功",list);
    }
}
