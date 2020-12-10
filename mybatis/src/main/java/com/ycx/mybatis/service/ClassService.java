package com.ycx.mybatis.service;

import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.mapper.ClassMapper;
import com.ycx.mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 16:12
 * @description
 **/
@Service
public class ClassService {
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private StudentMapper studentMapper;

    public ClassDto getClassAndStudent(Integer id){
       return classMapper.getClassAndStudent(id);
    }

}
