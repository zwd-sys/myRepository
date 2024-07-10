package com.cdtu.service;

import com.cdtu.utils.Result;

public interface OrderService {
    Result queryByCode(int id,String name);
}
