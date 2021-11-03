package com.kimbyulook.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Home(){
        return "home";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(){
     return "list";
    }
}

