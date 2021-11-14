package com.csy.sec.repository;

import com.csy.sec.model.UserDetailsVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberDao extends JpaRepository<UserDetailsVO, String> {



}
