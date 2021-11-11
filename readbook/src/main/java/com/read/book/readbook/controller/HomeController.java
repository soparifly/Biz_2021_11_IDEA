package com.read.book.readbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {

        return "헬로우";
    }

    @GetMapping(value = "/book")
    public Map<Integer,Object> book() {

        Map<Integer,Object> books = new HashMap<>();

        for(int i = 0; i < 10; i++) {

            Map<String,Object> book = new HashMap<>();
            book.put("isbn","101010202");
            book.put("title","자바의정석");
            book.put("author","남궁성");
            books.put(i,book);
        }

        return books;
    }
}
