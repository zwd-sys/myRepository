package com.cdtu.service.impl;


import com.cdtu.mapper.CouponMapper;
import com.cdtu.mapper.GoodTypeMapper;
import com.cdtu.model.GoodType;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import com.cdtu.service.CouponService;
import com.cdtu.service.GoodTypeService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodTypeServiceImpl implements GoodTypeService {
    @Autowired
    GoodTypeMapper GoodTypeMapper;
    @Override
    public Result queryAll() {
        List<GoodType> list=GoodTypeMapper.queryAll();
        for(GoodType g:list){
            System.out.println(g);
        }
        return new Result("200","查询成功",list);
    }
}
