package com.yami.shop.admin.test;

import com.google.common.collect.Lists;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Java8Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User();
        user1.setId("adc");
        user1.setName("123");
        User user2 = new User();
        user2.setId("dff");
        user2.setName("333");
        User user3 = new User();
        user3.setId("ddf");
        user3.setName("564");
        User user4 = new User();
        user4.setId("ddf");
        user4.setName("564");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.forEach(System.out::println);
        Map<String, User> map = list.stream().collect(Collectors.toMap(User::getId, user -> user,(k1,k2)->k1));
        Map<String, String> map2 = list.stream().collect(Collectors.toMap(User::getId, User::getName,(k1,k2)->k1));
        Map<String, String> map3 = list.stream().collect(Collectors.toMap(User::getId, User::getName,(k1,k2)->k1, LinkedHashMap::new));
        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3);

    }
}
