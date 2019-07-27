package com.coder.service;

import com.coder.dao.UserMapper;
import com.coder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用户服务模块
 * @Author 极客浅风
 * @create 2019/7/27 15:59
 */
public class UserService {
    @Autowired
    public User Userlogin(String username,String password) {
        ClassPathXmlApplicationContext ac
                = new ClassPathXmlApplicationContext(
                "spring/spring-dao.xml");
        UserMapper userMapper
                = ac.getBean("userMapper", UserMapper.class);
        User user = userMapper.findByUserName(username);
        if (user==null) {
            return null;
        }
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
