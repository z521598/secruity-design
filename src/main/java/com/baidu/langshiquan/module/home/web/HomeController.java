package com.baidu.langshiquan.module.home.web;

import com.baidu.langshiquan.module.home.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping({"", "/"})
    public String home() {
        return "home";
    }

    @RequestMapping("/404")
    public String info404() {
        System.out.println(404);
        return "404";
    }

}
