package com.ycx.shadingjdbc;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ycx.shadingjdbc.entity.Course;
import com.ycx.shadingjdbc.mapper.CourserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class ShadingjdbcApplicationTests {

    @Autowired
    private CourserMapper courserMapper;

    @Test
    void add() {
        for (int i = 0; i <= 10; i++) {
            Course course = new Course();
            course.setName("java" + i);
            course.setStatus("Normal" + i);
            courserMapper.insert(course);
        }
    }

    @Test
    public void select() {
        List<Long> ids = Arrays.asList(1341594480314200065L, 1341594477818589186L);
        IPage<Course> page = courserMapper.selectPage(new Page<>(1, 5), null);
        System.out.println(JSON.toJSONString(page));
    }

    @Test
    public void addCourseDb() {
        Course course = new Course();
        course.setName("javademo1");
        course.setUserId(112L);
        course.setStatus("Normal1");
        courserMapper.insert(course);
    }

    @Test
    public void findOne() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", 112L);
        wrapper.eq("id", 1343387052271505409L);
        Course course = courserMapper.selectOne(wrapper);
        System.out.println(course);
    }

    @org.junit.Test
    public void str(){
        String s1 = "123421";
        String s2 = s1.substring(0,2), s3 = s1.substring(2);
    }
}
