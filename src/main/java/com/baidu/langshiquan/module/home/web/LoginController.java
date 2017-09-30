package com.baidu.langshiquan.module.home.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.langshiquan.module.home.service.HomeService;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class LoginController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/login.action")
    public String home() {
        return "login";
    }

    @RequestMapping("/403")
    public String info403() {
        return "403";
    }

}
