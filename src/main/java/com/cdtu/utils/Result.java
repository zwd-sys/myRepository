package com.cdtu.utils;

import com.cdtu.model.User;
import lombok.Data;

@Data
public class Result {
    String code;
    String msg;
    Object object;

    public Result() {
    }

    public Result(String s, String msg, Object o) {
        this.code=s;
        this.msg=msg;
        this.object=o;
    }
}
