package com.ycx.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ycx.mybatis.dto.ClassDto;
import com.ycx.mybatis.mapper.ClassMapper;
import com.ycx.mybatis.mapper.StudentMapper;
import com.ycx.mybatis.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    //@Transactional(rollbackFor = {Throwable.class})
    public PageInfo<Class> getAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize,true);
        List<Class> classes = classMapper.selectAll();
        return new PageInfo<>(classes);
    }
}
