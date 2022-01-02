package com.itheima.demo;

import com.itheima.service.UserService;
import com.itheima.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Pnaking
 * @Date 2022/1/1 22:28
 * @Version 1.0
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

    }
}
