package com.tw.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
        private String location;

    public HomeController( ){
        location = "High tech district ,jing ye lu";
    }


    @RequestMapping("home")
    public String handleRequest(ModelMap modelMap){
        modelMap.put("homeID", "home");
        modelMap.put("homeLocation", location);
        return "homepage";
    }
}
