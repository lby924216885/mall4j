package com.yami.shop.admin.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestData {


    public  Object instanceObject(Class userClass, Map<String,Object> map) {
        try {
            Object  instance = userClass.newInstance();
            map.forEach((k,v)->{
                try {
                    userClass.getMethod(k,v.getClass()).invoke(instance,v);
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            return instance;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  Object instanceByConstructor(Class userClass, Object[] args, Class[] paramTypes) {
        try {
            return  userClass.getConstructor(paramTypes).newInstance(args);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
