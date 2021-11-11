package com.callor.sec.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated();
        http.formLogin();
        /**
         * spring Security 에서 form 으로 데이터를 전송할때
         * 보통 POST로 전송을 하는데
         * POST로 전송할때는 반드시 _scrf.token 값을
         * 데이터에 포함하여 전송을 해야한다
         * form 을 만들때, JSP, thymeleaf 등의 taglibs 등을 사용하면
         * 자동으로 _csrf.token을 form 에 포함 시키는 코드를 만들어준다
         *
         * 최근에 spring security 정책이
         * https( Hyper Text Transfer protocol Sec)가 적용된 곳에서는
         * 정상적으로 _csrf.token 을 form 에 추가를 한다
         *
         * 그런데 http로 되어있는 곳에서는 정상적으로 추가하지않는다.
         *
         *
         * ex ) input 박스에 데이터를 입력후 서버로 전송하면 프로토콜에의해서 암호화되어 전송된다
         *
        */
        // http로 test를 하는 경우에는 아래속성을 추가해줘야한다
        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
        //
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("callor")
                .password("{noop}1234")
                .roles("ADMIN");
    }
}
