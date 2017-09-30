package com.baidu.langshiquan.module.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.langshiquan.module.user.module.User;

/**
 * Created by langshiquan on 17/9/30.
 */
// FIXME
@Controller
@RequestMapping("/valid")
public class ValidController {

    @RequestMapping(value = "/1", method = RequestMethod.POST)
    public String v1(User user) {
        System.out.println(user);
        return "home";
    }

}
