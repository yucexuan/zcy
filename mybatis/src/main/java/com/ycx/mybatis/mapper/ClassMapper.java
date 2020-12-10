package com.ycx.mybatis.mapper;

import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.model.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Class record);

    Class selectByPrimaryKey(Integer id);

    List<Class> selectAll();

    int updateByPrimaryKey(Class record);



    ClassDto getClassAndStudent(Integer id);
}