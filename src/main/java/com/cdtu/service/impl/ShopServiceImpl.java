package com.cdtu.service.impl;


import com.cdtu.mapper.GoodMapper;
import com.cdtu.mapper.GoodTypeMapper;
import com.cdtu.mapper.ShopMapper;
import com.cdtu.model.Good;
import com.cdtu.model.GoodType;
import com.cdtu.model.shop;
import com.cdtu.service.GoodService;
import com.cdtu.service.ShopService;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper ShopMapper;
    @Override
    public Result queryAll() {
        List<shop> list=ShopMapper.queryAll();
        for(shop s:list){
            System.out.println(s);
        }
        return new Result("200","查询成功",list);
    }
}
