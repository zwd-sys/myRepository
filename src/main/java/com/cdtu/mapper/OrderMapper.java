package com.cdtu.mapper;

import com.cdtu.model.Order;
import com.cdtu.model.user_good;
import com.cdtu.utils.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<user_good> queryByCode(@Param("user_id") int user_id, @Param("good_code")String good_code);
}
