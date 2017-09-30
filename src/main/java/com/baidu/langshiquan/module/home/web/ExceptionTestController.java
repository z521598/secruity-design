package com.baidu.langshiquan.module.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by langshiquan on 17/9/30.
 */
@Controller
@RequestMapping("/exp")
public class ExceptionTestController {

    @RequestMapping("/1")
    public String exp1() {
        int i = 5 / 0;
        return "home";
    }

    @RequestMapping("/2")
    public String exp2() {
        throw new RuntimeException();
        //        return "home";
    }

    @ExceptionHandler
    public String exceptionHandler(Exception e) {
        e.printStackTrace();
        return "500";
    }

    @ExceptionHandler
    public String arithExceptionHandler(ArithmeticException e) {
        e.printStackTrace();
        return "514";
    }

}
