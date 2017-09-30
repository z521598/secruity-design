package com.baidu.langshiquan.module.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.langshiquan.module.user.module.User;

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

    @RequestMapping("/testUser")
    @ResponseBody
    public User testUser() {
        return new User(1l, "lsq");
    }
}
