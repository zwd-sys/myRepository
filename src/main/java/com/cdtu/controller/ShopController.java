package com.cdtu.controller;

import com.cdtu.service.impl.GoodServiceImpl;
import com.cdtu.service.impl.ShopServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopController {
    @Autowired
    ShopServiceImpl ShopServiceImpl;
    @RequestMapping("/queryAllShop")
    @ResponseBody
    public Object queryAll(){
        Result result= ShopServiceImpl.queryAll();
        System.out.println(result);
        return result;
    }
}
