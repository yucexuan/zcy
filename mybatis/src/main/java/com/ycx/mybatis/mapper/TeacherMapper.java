package com.ycx.mybatis.mapper;

import com.ycx.mybatis.model.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(String tId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(String tId);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);
}