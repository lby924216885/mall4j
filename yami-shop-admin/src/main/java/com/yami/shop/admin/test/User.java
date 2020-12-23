package com.yami.shop.admin.test;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true) // 链式方法
@lombok.Data
public class User {
    private String id;
    private String name;
}
