package com.kimbyulook.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET,produces ="text/html; charset=utf-8"  )
    public String Home(){
        return "인텔리제이";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("NAME","홍길동");
        return "home";
    }
}
