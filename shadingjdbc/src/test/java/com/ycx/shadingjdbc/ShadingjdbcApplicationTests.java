package com.ycx.shadingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ycx.shadingjdbc.entity.Course;
import com.ycx.shadingjdbc.mapper.CourserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ShadingjdbcApplicationTests {

	@Autowired
	private CourserMapper courserMapper;

	@Test
	void add() {
		for (int i = 0; i <=10; i++) {
			Course course = new Course();
			course.setName("java"+i);
			course.setStatus("Normal"+i);
			courserMapper.insert(course);
		}
	}

	@Test
	public void select(){
		QueryWrapper<Course> wrapper = new QueryWrapper<>();
		wrapper.eq("id",1341594481148866561L);
		Course course = courserMapper.selectOne(wrapper);
		System.out.println(course);
	}

}
