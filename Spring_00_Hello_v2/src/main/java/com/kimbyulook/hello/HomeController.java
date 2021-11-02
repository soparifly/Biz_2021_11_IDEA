package com.kimbyulook.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET, produces="text/html; charset=utf-8")
    public String Home(){
        return "안녕하세여 저인텔리제이에요";
    }

}
