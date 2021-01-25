package com.ycx.mybatis.dto;

import com.ycx.mybatis.model.Student;
import lombok.Data;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/11 13:15
 * @description
 **/
@Data
public class Parent {
    private String parentName;
    private Student student;
}
