package com.csy.sec.service;

import com.csy.sec.model.UserDetailsVO;

import java.util.List;

public interface MemberService extends GenericService<UserDetailsVO,String> {

    public List<UserDetailsVO> findByEmail(String Email);
    public List<UserDetailsVO> findByTel(String tel);

    public int  userCount();




}
