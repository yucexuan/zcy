package com.ycx.mybatis.dto;

import com.ycx.mybatis.model.Student;
import lombok.Data;

import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 16:20
 * @description
 **/
@Data
public class ClassDto {
    private Integer id;
    private String className;
    private Integer teacherId;
    private List<Student> students;
}
