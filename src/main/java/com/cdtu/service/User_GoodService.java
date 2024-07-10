package com.cdtu.service;


import com.cdtu.model.user_good;
import com.cdtu.utils.Result;

public interface User_GoodService {
    Result insertCoupon(user_good user_good);
    Result queryByCode(user_good user_good);
}
