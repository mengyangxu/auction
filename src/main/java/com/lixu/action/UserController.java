package com.lixu.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by xmy on 2018/3/10.
 */
@Controller
public class UserController {

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "nihao";
    }
}
