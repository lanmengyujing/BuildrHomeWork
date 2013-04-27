package com.tw.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public String test(HttpServletRequest request,ModelMap modelMap) {

        modelMap.put("age", "22");
        request.setAttribute("name", "Harry");
        System.out.println("come to Controller" + new Date().toString());
        return "hello";
    }
}
