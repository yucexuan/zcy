package com.ycx.mybatis.controller;

import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.PortUnreachableException;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 16:12
 * @description
 **/
@RestController
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public ClassDto getClass(@RequestParam(value = "id") Integer id){
        return classService.getClassAndStudent(id);
    }
}
