package com.kimbyulook.student.service.impl;

import com.kimbyulook.student.model.StudentVO;
import com.kimbyulook.student.repository.StDao;
import com.kimbyulook.student.repository.StDaoImpl;
import com.kimbyulook.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplV1 implements StudentService {


    private final StDao stDao;

    public StudentServiceImplV1() {
        stDao = new StDaoImpl();
    }

    public StudentServiceImplV1(StDao stDao) {
        this.stDao = stDao;
    }

    @Override
    public List<StudentVO> selectAll() {
        return stDao.selectAll();
    }

    @Override
    public StudentVO findByNum(String st_num) {
        return null;
    }

    @Override
    public List<StudentVO> findByName(String st_name) {
        return null;
    }

    @Override
    public List<StudentVO> findByTel(String st_tel) {
        return null;
    }

    @Override
    public List<StudentVO> findByDept(String st_dept) {
        return null;
    }

    @Override
    public List<StudentVO> fndByGrade(String st_grade) {
        return null;
    }

    @Override
    public StudentVO insert() {
        return null;
    }

    @Override
    public void insert(StudentVO stVO) {

    }

    @Override
    public void update(StudentVO stVO) {

    }

    @Override
    public void delete(String st_num) {

    }
}
