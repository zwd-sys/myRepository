package com.cdtu.model;

import lombok.Data;

@Data
public class shop {
    private int id;
    private String name;
    private String address;
    private String open_time;
    private String status;
    private double distance;
    private String latitude;
    private String longitude;
}
