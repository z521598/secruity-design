package com.baidu.langshiquan.module.home.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.langshiquan.module.home.service.HomeService;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class LoginController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/login.action")
    @ResponseBody
    public String home() {
        return "home";
    }

    @RequestMapping("/403.action")
    @ResponseBody
    public String info403() {
        return "403";
    }

}
