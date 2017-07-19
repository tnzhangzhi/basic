package com.zhz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zz1987 on 17/7/19.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String test(){
        return "test";
    }
}
