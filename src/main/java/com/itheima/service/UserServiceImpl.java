package com.itheima.service;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Pnaking
 * @Date 2022/1/1 22:27
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {

        userDao.save();
    }
}
