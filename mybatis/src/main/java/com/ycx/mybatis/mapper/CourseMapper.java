package com.ycx.mybatis.mapper;

import com.ycx.mybatis.model.Course;
import java.util.List;

public interface CourseMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Course record);

    Course selectByPrimaryKey(String cId);

    List<Course> selectAll();

    int updateByPrimaryKey(Course record);
}