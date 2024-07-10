package com.cdtu.mapper;

import com.cdtu.model.GoodType;
import com.cdtu.model.coupon;
import com.cdtu.model.user_coupon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodTypeMapper {
     List<GoodType> queryAll();
     List<GoodType> queryByName(@Param("name") String name);
}
