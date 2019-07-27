package com.coder.dao;

import com.coder.entity.User;

/**
 * @Author 极客浅风
 * @create 2019/7/26 19:40
 */
public interface UserMapper {
    User findById(Integer uid);

    User findByUserName(String username);
}
