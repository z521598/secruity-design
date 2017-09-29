package com.baidu.langshiquan.module.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by langshiquan on 17/9/29.
 */
@Controller
@RequestMapping("/oneUser")
public class OneUserController {

    @RequestMapping("/userInfo.action")
    @ResponseBody
    public String userInfo() {
        return "userInfo";
    }
}
