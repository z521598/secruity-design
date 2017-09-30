package com.baidu.langshiquan.module.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by langshiquan on 17/9/30.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/1")
    @ResponseBody
    public String admin1() {
        return "admin1";
    }
}
