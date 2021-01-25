package com.ycx.mybatis.tetst;

import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.model.Student;
import com.ycx.mybatis.util.ReflectionUtil;
import org.junit.Test;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/6 16:11
 * @description
 **/
public class MainTest {
    @Test
    public void test1(){
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void getField() throws NoSuchFieldException {
        Field student = ReflectionUtil.getField(ClassDto.class, "student");
        System.out.println(student.getName());
    }
}
