package com.ycx.mongo.controller;

import com.ycx.mongo.bean.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yucexuan
 * @version 1.0
 * @date 2021/1/12 22:49
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private MongoTemplate template;

    @PostMapping
    public Object save(@RequestBody Teacher teacher){
        return template.save(teacher);
    }

    @GetMapping("/all")
    public List<Teacher> getAll(){
        return template.findAll(Teacher.class);
    }

    @GetMapping("/name")
    public Teacher getByName(@RequestParam String name){
        Query query = new Query(Criteria.where("name").is(name));
        return template.findOne(query,Teacher.class);
    }

    @PutMapping
    public void update(@RequestParam String name,@RequestParam String lover){
        Query query = new Query(Criteria.where("name").is(name));
        Update set = new Update().set("lover", lover);
        template.upsert(query,set,Teacher.class);
    }

    @DeleteMapping
    public void delete(@RequestParam String name) throws IllegalAccessException, InstantiationException {
        Query query = new Query(Criteria.where("name").is(name));
        template.remove(query,Teacher.class);
        Teacher teacher = Teacher.class.newInstance();
    }
}

