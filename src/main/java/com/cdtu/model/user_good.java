package com.cdtu.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class user_good {
    private int id;
    private int user_id;
    private String xiadan_time;
    private String good_code;
    private float money;
    private float coupon_money;
    private List<Order> orderList;
}
