package com.kimbyulook.student.controller;

import com.kimbyulook.student.model.StudentVO;
import com.kimbyulook.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {
    /**
     * 현재 방식은 setter  주입방식으로 객체를 DI하기
     * 메모리 누수가 발상한다고 보고되었고
     * 생성자 방식에 비해서 Null Point Exception 이 발생할 확률도 있다고한다.
     *
     * setter 주입방식보다는 생성자주입방식을 권장한다
     *
     *
     */


    /**
     * 생성자 주입방식
     * 1.주입받을 객체를 선언 (가급적 인터페이스로)
     * 2.final 선언하여 불변격체로 변환
     * 3. 생성자 method를 선언
     * 생성자 주입방식은 setter주입 방식에 비해
     * 더강력한 강제성을 갖는다
     *
     */
    private final StudentService stService;

    //왜 밑줄그어짐?
    @Autowired
    public StudentController(StudentService stService){
        this.stService = stService;

    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<StudentVO> stList = stService.selectAll();
        model.addAttribute("STLIST",stList);
        return "layout";

    }
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String details(){
        return "ST_DETAIL";
    }

}
