package com.ycx.mybatis.mapper;

import com.ycx.mybatis.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    /**
     *
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