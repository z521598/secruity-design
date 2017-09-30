package com.baidu.langshiquan.module.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by langshiquan on 17/9/30.
 */
@Controller
@RequestMapping("/test")
public class SimpleTestController {

    @RequestMapping("/1")
    @ResponseBody
    public String t1() {
        return "home";
    }

    @RequestMapping("/2")
    @ResponseBody
    public String t2() {
        return "home";
    }

}
