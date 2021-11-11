package com.kimbyulook.student.service;

import com.kimbyulook.student.model.StudentVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StService {
    public List<StudentVO> selectAll();
}
