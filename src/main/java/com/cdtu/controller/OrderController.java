package com.cdtu.controller;

import com.cdtu.service.impl.GoodServiceImpl;
import com.cdtu.service.impl.OrderServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    OrderServiceImpl OrderServiceImpl;
    @RequestMapping("/queryByOrderCode")
    @ResponseBody
    public Object queryByCode(int id, String code){
        System.out.println(id);
        System.out.println(code);
        Result Result=OrderServiceImpl.queryByCode(id,code);
        System.out.println(Result);
        return Result;
    }
}
