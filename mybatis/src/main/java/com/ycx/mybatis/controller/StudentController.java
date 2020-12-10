package com.ycx.mybatis.controller;

import com.ycx.mybatis.dto.PageDto;
import com.ycx.mybatis.dto.RestModel;
import com.ycx.mybatis.model.Student;
import com.ycx.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:47
 * @description
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public RestModel<PageDto> getByPage(@RequestParam(defaultValue = "1",required = false) Integer pageNum,
                                        @RequestParam(defaultValue = "20",required = false) Integer pageSize,
                                        @RequestParam(required = false) String name){
      PageDto pageDto = studentService.getByPage(pageNum,pageSize,name);
       return new RestModel<>(pageDto);
    }
}
