package com.coder.controller;

import com.coder.entity.User;
import com.coder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 极客浅风
 * @create 2019/7/27 9:39
 */
@Controller
public class UserController{
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String startLogin() {
        return "login";
    }

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
        UserService userService=new UserService();
        User user=userService.Userlogin(username,password);
        if (user==null) {
            return "login";
        }
        return "index";
    }

}
