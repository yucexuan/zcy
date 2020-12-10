package com.ycx.mybatis.controller;

import com.ycx.mybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:47
 * @description
 **/
@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


}
