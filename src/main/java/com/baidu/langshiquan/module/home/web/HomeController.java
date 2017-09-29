package com.baidu.langshiquan.module.home.web;

import com.baidu.langshiquan.module.home.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/info")
    @ResponseBody
    public String home() {
        return "0";
    }

    @RequestMapping("")
    @ResponseBody
    public String homeinfo(HttpServletRequest request) {
        return "";
    }
}
