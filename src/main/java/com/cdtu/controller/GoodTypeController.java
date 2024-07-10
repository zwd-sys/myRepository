package com.cdtu.controller;

import com.cdtu.service.CouponService;
import com.cdtu.service.GoodTypeService;
import com.cdtu.service.impl.UserServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodTypeController {
    @Autowired
    GoodTypeService GoodTypeService;
    @Autowired
    UserServiceImpl UserServiceImpl;
    @RequestMapping("/queryAll")
    @ResponseBody
    public Object queryAll(){
        Result result=GoodTypeService.queryAll();
        System.out.println(result);
        return result;
    }
}
