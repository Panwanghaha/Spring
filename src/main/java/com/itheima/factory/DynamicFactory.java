package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @Author Pnaking
 * @Date 2022/1/1 22:19
 * @Version 1.0
 */
public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
