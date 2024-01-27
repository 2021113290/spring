package com.xy.controller;

import com.xy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {


    //    1.使用属性注入的方式获取bean
//    @Autowired
//    private StudentService studentService;
//    2.set注入
//    private StudentService studentService;
//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }
//    3.构造方法注入
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void sayhi(){
//        调用service
        studentService.sayhi();
    }
}
