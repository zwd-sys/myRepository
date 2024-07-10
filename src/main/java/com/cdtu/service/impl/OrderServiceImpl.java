package com.cdtu.service.impl;


import com.cdtu.mapper.GoodMapper;
import com.cdtu.mapper.GoodTypeMapper;
import com.cdtu.mapper.OrderMapper;
import com.cdtu.model.Good;
import com.cdtu.model.GoodType;
import com.cdtu.model.Order;
import com.cdtu.model.user_good;
import com.cdtu.service.GoodService;
import com.cdtu.service.OrderService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper OrderMapper;
//    @Override
//    public Result queryByName(String name) {
//        System.out.println(name);
//        List<GoodType> list=GoodTypeMapper.queryByName(name);
//        List<Good> goodlist=new ArrayList<>();
//        for(GoodType g:list){
//            System.out.println(g);
//            goodlist=g.getFoods();
//        }
//        return new Result("200","查询成功",list);
//    }

    @Override
    public Result queryByCode(int user_id, String good_code) {
        System.out.println(user_id);
        System.out.println(good_code);
        List<user_good> Order =OrderMapper.queryByCode(user_id,good_code);
        for(user_good o:Order){
            System.out.println(o);
        }
        return new Result("200","查询成功",Order);
    }
}
