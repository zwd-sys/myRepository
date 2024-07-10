package com.cdtu.controller;

import com.cdtu.model.User;
import com.cdtu.service.impl.UserServiceImpl;
import com.cdtu.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl UserServiceImpl;
//    @RequestMapping("/hello")
//    @ResponseBody
//    public List<User> hello(Model Model){
//        PageHelper.startPage(2,2);
//        List<User> list=UserService.getAll();
//        return list;
//    }
//    @RequestMapping("/getUserByID")
//    @ResponseBody
//    public Object getByID(Integer id){
////        User user=UserService.getById(id);
////        System.out.println(user);
//        List<User> list=UserService.getAll();
//        for(User user:list){
//            System.out.println(user);
//        }
//        return list;
//    }
    @RequestMapping("/login")
    @ResponseBody
    public Object login(String code,String avatarURL,String nickName){
        Result result= UserServiceImpl.login(code,avatarURL,nickName);
        return result;
    }
    @RequestMapping("/update")
    @ResponseBody
    public Object update(String openId,String nickName,String phone,String sex,String birthday) throws ParseException {
        User User=new User();
        User.setOpenId(openId);
        User.setUserName(nickName);
        User.setPhone(phone);
        User.setSex(sex);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        User.setBirthday(ft.parse(birthday));
        UserServiceImpl.update(User);
        Result result= UserServiceImpl.queryByOpenid(openId);
        System.out.println(result);
        return result;
    }
    @RequestMapping("/queryUpdate")
    @ResponseBody
    public Object queryUpdate(String openId){
        Result result= UserServiceImpl.queryByOpenid(openId);
        System.out.println(result);
        return result;
    }
}
