package com.cdtu.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int oid;
    private int good_id;
    private String good_name;
    private float good_price;
    private String good_img;
    private int good_num;
    private int order_id;
    //private List<user_good> orderList;
}
