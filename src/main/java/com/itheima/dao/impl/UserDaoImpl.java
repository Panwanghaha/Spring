package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author Pnaking
 * @Date 2022/1/1 21:58
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;


    public void setUsername(String username) {
        this.username = username;
    }


    public void setAge(int age) {
        this.age = age;
    }

//
//    public UserDaoImpl(){
//        System.out.println("创建对象——————————");
//    }
//
//    public void init(){
//        System.out.println("初始化——————");
//    }
//
//    public void destory(){
//        System.out.println("销毁方法+++++++");
//    }

    @Override
    public void save() {
//        System.out.println(username + "++++++++++++" + age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running.......");
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
