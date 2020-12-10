package com.ycx.mybatis.mapper;

import com.ycx.mybatis.dto.PageDto;
import com.ycx.mybatis.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String sId);

    int insert(Student record);

    Student selectByPrimaryKey(String sId);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    /**
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    List<Student> getByPage(@Param("pageNum") int pageNum,
                      @Param("pageSize") Integer pageSize,
                      @Param("name") String name);

    /**
     *
     * @param name
     * @return
     */
    Integer countStudents(@Param("name") String name);
}