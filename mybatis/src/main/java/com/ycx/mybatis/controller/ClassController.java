package com.ycx.mybatis.controller;

import com.github.pagehelper.PageInfo;
import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.dto.RestModel;
import com.ycx.mybatis.model.Class;
import com.ycx.mybatis.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.PortUnreachableException;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 16:12
 * @description
 **/
@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping
    public ClassDto getClass(@RequestParam(value = "id") Integer id){
        return classService.getClassAndStudent(id);
    }

    @GetMapping("/getByPage")
    public RestModel getByPage(@RequestParam(defaultValue = "1",required = false) Integer pageNum,
                               @RequestParam(defaultValue = "1",required = false) Integer pageSize){
       PageInfo<Class> pageInfo = classService.getAll(pageNum,pageSize);
       return new RestModel(pageInfo);
    }
}
