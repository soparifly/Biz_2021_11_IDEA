package com.csy.sec.service.impl;

import com.csy.sec.model.UserDetailsVO;
import com.csy.sec.repository.MemberDao;
import com.csy.sec.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("memServiceV1")
public class MemberServiceImplV1 implements MemberService {


    private final MemberDao memDao;
    public MemberServiceImplV1(MemberDao memDao) {
        this.memDao = memDao;
    }

    @Override
    public List<UserDetailsVO> selectAll() {
        List<UserDetailsVO> memberList = memDao.findAll();

        return memberList;
    }

    @Override
    public UserDetailsVO findById(String username) {
        UserDetailsVO userVO = memDao.findById(username).orElse(null
        );

        return userVO;
    }

    @Override
    public void insert(UserDetailsVO userDetailsVO) {
    memDao.save(userDetailsVO);
    }

    @Override
    public void update(UserDetailsVO userDetailsVO) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public List<UserDetailsVO> findByEmail(String Email) {
        return null;
    }

    @Override
    public List<UserDetailsVO> findByTel(String tel) {
        return null;
    }

    @Override
    public int userCount() {
        return 0;
    }
}
