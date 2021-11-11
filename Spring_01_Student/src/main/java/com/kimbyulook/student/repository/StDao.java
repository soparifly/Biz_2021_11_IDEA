package com.kimbyulook.student.repository;

import com.kimbyulook.student.model.StudentVO;

import java.util.List;

public interface StDao {
    public List<StudentVO> selectAll();
    public StudentVO findById(String st_num);
    public void insert(StudentVO vo);
    public void update(StudentVO vo);
    public void delete(StudentVO vo);
}
