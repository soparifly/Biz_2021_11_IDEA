package com.csy.sec.model.service;

import com.csy.sec.model.UserDetailsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * security 에서 login 서비스를 수행하는 방법이 다양하다
 *
 * DB와 연동을 하여 로그인을 수행하는 비교적 쉬운 방법으로
 * UserDetailService 상속받아 클래스를 만들고 수행한다
 *
 *
 */
@Slf4j
public class LoginService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 1. dao에서 사용자 정보가져오기
//    username 으로 member table에서
//    findById(username) 등을 수행하여
//    User 정보를 가져온다
        UserDetailsVO userVO = UserDetailsVO.builder().username("callor").password("{noop}1234").build();
//    2. dao에서 받은 사용자 정보가 없으면
//       즉 username 에 저장된 사용자 이름이
//      DB에 없으면
        if (userVO == null) {
            log.debug("{} username없음", username);
            throw new UsernameNotFoundException(username + "사용자 없음");
        }
        try {
            UserDetails vo =loadUserByUsername("callor");
        }catch (UsernameNotFoundException e){
            //redirect "/member/login?error = xxxx";
        }

        return userVO;

    }
}