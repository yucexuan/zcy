package com.ycx.mybatis.controller;

import com.ycx.mybatis.service.ReportService;
import com.ycx.mybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:47
 * @description
 **/
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private List<ReportService> reportServices;

    @GetMapping("/test")
    public String test(){
        return "redirect:index.html";
    }

}
