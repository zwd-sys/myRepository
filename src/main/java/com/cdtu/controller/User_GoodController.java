package com.cdtu.controller;

import com.cdtu.model.Good;
import com.cdtu.model.user_good;
import com.cdtu.service.CouponService;
import com.cdtu.service.User_GoodService;
import com.cdtu.service.impl.CouponServiceImpl;
import com.cdtu.service.impl.UserServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class User_GoodController {
    @Autowired
    User_GoodService User_GoodService;
    @Autowired
    CouponServiceImpl CouponServiceImpl;
    @Autowired
    UserServiceImpl UserServiceImpl;
    @RequestMapping("/insertUsergood")
    @ResponseBody
    public Object insertUser_good(int id,String openId){
        CouponServiceImpl.delete(id);
        Result result= UserServiceImpl.queryByOpenid(openId);
        System.out.println(result);
        return result;
    }
    @RequestMapping("/queryByCode")
    @ResponseBody
    public Object queryByCode(int id,String code){
        user_good user_good=new user_good();
        user_good.setUser_id(id);
        user_good.setGood_code(code);
        Result Result=User_GoodService.queryByCode(user_good);
        System.out.println(Result);
        return Result;
    }
}
