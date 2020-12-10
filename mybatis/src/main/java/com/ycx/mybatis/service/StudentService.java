package com.ycx.mybatis.service;

import com.ycx.mybatis.dto.PageDto;
import com.ycx.mybatis.mapper.StudentMapper;
import com.ycx.mybatis.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:49
 * @description
 **/
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public PageDto<Student> getByPage(Integer pageNum, Integer pageSize, String name) {
        List<Student> byPage = studentMapper.getByPage((pageNum - 1) * pageSize, pageSize, name);
        Integer count = studentMapper.countStudents(name);
        PageDto<Student> pageDto = new PageDto<>();
        pageDto.setData(byPage);
        pageDto.setTotal(count);
        pageDto.setTotalPage((count+pageSize-1)/pageSize);
        return pageDto;
    }
}
