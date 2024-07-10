package com.cdtu.service;

import com.cdtu.model.Good;
import com.cdtu.model.coupon;
import com.cdtu.utils.Result;

import java.util.List;

public interface GoodService {
    Result queryByName(String name);
}
