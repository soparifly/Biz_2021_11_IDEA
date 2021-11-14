package com.csy.sec.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Collection;

/**
 * spring security 에서 회원 인증 정보(회원정보)를
 * 담아서 사용할 UserVO는 반드시 UserDetails inteface를 상속하여
 * 작성하도록 하고있다.
 *
 * security에 내장된 어떤 연산에서 사용자 정보를 읽고, 쓰기를 시도하려고한다
 * 내 맘대로 vo의 변수를 선언하고, getter, setter 도 임의로 선언을 하게 된다면
 * Security의 어떤 연산이 VO객체에 값을 쓰거나(setter) 읽을때(getter)할때
 * 상당히 문제를 일으킬것이다.
 *
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetailsVO implements UserDetails {


    private Long id;
    /*
    필수항목
    id 를 제외한 변수들은 keyword와 마찬가지임으로 임의로 변경될수없다
     */
    @Id
    @Column(columnDefinition = "VARCHAR(512)")
    private String username;
    @Column(columnDefinition = "VARCHAR(512)",nullable = false)
    private String password;

    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    /**
     * 필요에 따라 추가하여 사용할수 있는 변수들
     * 임의추가
     */
    private String email;
    private String tel;
    private String address;

    private boolean isEnabled;

}
