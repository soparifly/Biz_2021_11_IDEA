package com.csy.sec.controller;

import com.csy.sec.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping(value="/member")
public class MemberController {

    private  final MemberService memberService;

    public MemberController(@Qualifier("memServiceV1") MemberService memberService) {
        this.memberService = memberService;

    }

    // login form 을 열기 위한 URL (* 우리가 만든 form 을 열기 위해 method 를 GET 으로 해줘야 한다)
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login() {
        return "member/login";
    }

    @RequestMapping(value = "/join" , method = RequestMethod.GET)
    public String join() {
        log.debug("회원가입");

        return "member/join";
    }


    public UserDetails idcheck(String username) {
        /**
         * service(dao) findById(username)으로 조회를 하여 결과를 바로 return 할수 있다
         *
         * 이미 데이터가 있으면 회원정보가 return
         *
         * 그렇지않으면 Null 값이 자동으로 return 될것이다
         * return. sService.findById(username)
         */

//        if (username.equalsIgnoreCase("callor")) {
//            return "FAIL";
//        }else {
//            return null;
//        }
        return memberService.findById(username);

    }
}
