package com.cdtu.controller;

import com.cdtu.service.CouponService;
import com.cdtu.service.GoodService;
import com.cdtu.service.impl.GoodServiceImpl;
import com.cdtu.service.impl.UserServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodController{
    @Autowired
    GoodServiceImpl GoodServiceImpl;
    @RequestMapping("/queryByName")
    @ResponseBody
    public Object queryByName(String searchMsg){
        System.out.println(searchMsg);
        Result result= GoodServiceImpl.queryByName(searchMsg);
        System.out.println(result);
        return result;
    }
}
