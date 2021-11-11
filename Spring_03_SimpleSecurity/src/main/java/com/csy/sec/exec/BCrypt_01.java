package com.csy.sec.exec;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCrypt_01 {


    public static void main(String[] args) {
/**
 * 암호화, 복호화
 * 보안과 관련된 용어중"인가"
 * username, password 를 입력받아
 * 정상적인 사용자 username password 인지 검사하고
 * 접삭을 허가하는 절차
 *
 * 양방향 암호화를 이용한 보안
 * jsypt 를 이용한 암호화방법
 * 이때 ussername 은 보통 문자열로 구성하지만
 * password는 가급적 노출되지않도록 "암호화(encrypt)"를 한다
 *
 * 암호화된 password를 DB에 저장하고
 * 저장된 암호화 password를 다시 "복호화"하여 로그인 정보와 비교한다
 *
 * 단방향 암호화를 이용한 보안
 * PasswordEncoder(BCrptPasswordEncoder로 구현)
 * 회원 가입을 할때, 비번을 암호화 하여 저장을 하고
 *
 * 로그인을 할때 DB에서 회원 정보를 SELECT 한 후
 * login 을 통해 전달된 Password와 비교를 하는데
 * 이절차가 복화를 하는게 아니라
 * DB에 저장된 Password를 복호화 하지않고
 * login을통해 전달된 Password를 다시 암호화 하여
 *  두 값을 비교한다
 *
 */
        PasswordEncoder pass = new BCryptPasswordEncoder();

        String password = "12345";
        String encPassword = "!@#@!$#$!@#@!#";

        String bcPassword = pass.encode(password);
        System.out.println(bcPassword);

//        matches(rowPassowrd, encPassowrd)
        boolean loginOK = pass.matches(password, encPassword);

    if(loginOK){
        System.out.println("맞았습니다");

    }else{
        System.out.println("틀림");
    }

    }



}
