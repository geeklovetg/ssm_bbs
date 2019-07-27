package com.coder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 极客浅风
 * @create 2019/7/27 10:50
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(@RequestParam(value = "page",required=false) String page) {
        
        return "index";
    }
}
