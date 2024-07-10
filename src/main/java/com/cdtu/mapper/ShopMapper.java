package com.cdtu.mapper;

import com.cdtu.model.GoodType;
import com.cdtu.model.shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShopMapper {
     List<shop> queryAll();
}
