package com.yami.shop.admin.test;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true) // 链式方法
@lombok.Data
public class User {
    private String id;
    private String name;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
