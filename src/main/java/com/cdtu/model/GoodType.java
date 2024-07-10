package com.cdtu.model;

import lombok.Data;

import java.util.List;

@Data
public class GoodType {
    private int id;
    private String typename;
    private List<Good> foods;
}
