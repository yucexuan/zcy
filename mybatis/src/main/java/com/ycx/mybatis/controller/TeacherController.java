package com.ycx.mybatis.controller;

import com.ycx.mybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.web.bind.annotation.*;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:47
 * @description
 **/
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public String get() {
        return "hrr ";
    }

    @PostMapping
    public String post(){
        return "POST";
    }

    @PutMapping
    public String put(){
        return "PUT";
    }

    @DeleteMapping
    public String delete(){
        return "DELETE";
    }
}
