package com.cdtu.service.impl;

import com.cdtu.mapper.UserMapper;
import com.cdtu.model.User;
import com.cdtu.model.coupon;
import com.cdtu.utils.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

@Service
public class UserServiceImpl implements com.cdtu.service.UserService {
    @Autowired
    UserMapper UserMapper;
    @Autowired
    CouponServiceImpl CouponServiceImpl;
    @Override
    public Result login(String code,String avatarURL,String nickName){
        System.out.println("code:"+code);
        System.out.println("avatarURL:"+avatarURL);
        System.out.println("nickName:"+nickName);
        String URL="https://api.weixin.qq.com/sns/jscode2session?appid=wx6b219c78f5153161&secret=9d178c985316e24e30f7fdd7efc98055" +
                "&js_code="+code+"&grant_type=authorization_code";
        RestTemplate RestTemplate=new RestTemplate();
        ResponseEntity<String> forenTity=RestTemplate.getForEntity(URL,String.class);
        System.out.println("响应头"+forenTity.getHeaders());
        System.out.println("响应体"+forenTity.getBody());
        //字符串转换json
        ObjectMapper jsonNode=new ObjectMapper();
        JsonNode jsonNode1= null;
        String openId=null;
        try {
            jsonNode1 = jsonNode.readTree(forenTity.getBody());
            openId=jsonNode1.get("openid").asText();
            System.out.println("openid:"+openId);
            User User= (com.cdtu.model.User) queryByOpenid(openId).getObject();
            System.out.println(User);
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
            String date=ft.format(User.getBirthday());
            ft.setLenient(true);
            User.setBirthdaytime(date);
            if(User!=null){
                System.out.println(User);
                return new Result("200","登录成功",User);
            }else {
                insert(new User(openId,avatarURL,nickName,0,0,0));
                return new Result("200","添加成功",null);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return new Result("201","openid创建失败",null);
        }
    }
    //通过openid查询用户
    @Override
    public Result queryByOpenid(String openid) {
        User user=UserMapper.queryByOpenid(openid);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        if(user!=null){
            String date=ft.format(user.getBirthday());
            ft.setLenient(true);
            user.setBirthdaytime(date);
            return new Result("200", "查询成功", user);
        }else{
            User user1=UserMapper.queryByOpenid1(openid);
            String date=ft.format(user1.getBirthday());
            ft.setLenient(true);
            user1.setBirthdaytime(date);
            if(user1==null){
                return new Result("201","查询失败",null);
            }else {
                return new Result("200","无优惠卷",user1);
            }
        }
    }
    //无openid添加用户
    @Override
    public Result insert(User User) {
        UserMapper.insert(User);
        return new Result("200","添加成功",null);
    }
    @Override
    public Result update(User User) {
        UserMapper.update(User);
        return new Result("200","修改成功",null);
    }
}
