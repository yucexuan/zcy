package com.ycx.mongodb.controller;

import com.mongodb.client.model.Sorts;
import com.mongodb.client.result.UpdateResult;
import com.ycx.mongodb.bean.Grade;
import com.ycx.mongodb.bean.User;
import com.ycx.mongodb.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/12 12:02
 * @description
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private MongoTemplate template;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User save(@RequestParam Integer age, @RequestParam String username) {
        User user = new User();
        user.setAge(age);
        user.setUsername(username);
        return template.save(user, "user");

    }

    @GetMapping
    public List<User> get() {
        //userRepository.f
        Iterable<User> all = userRepository.findAll();
        List<User> userList = StreamSupport.stream(all.spliterator(), false).collect(Collectors.toList());
        return userList;
    }

    @PostMapping("/batch")
    public void saveBatch() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setUsername("小红" + i);
            user.setAge(i);
            userList.add(user);
        }
        template.insert(userList, User.class);
    }

    @GetMapping("/condition")
    public Page<User> getByCondition() {
        User user = new User();
        user.setUsername("小红");
        ExampleMatcher username = ExampleMatcher.matching()
                .withMatcher("username", p -> p.startsWith());
        Example<User> example = Example.of(user, username);
        Sort sort = Sort.sort(User.class).by(User::getAge).ascending();
        PageRequest request = PageRequest.of(2, 20, sort);
        Page<User> all = userRepository.findAll(example, request);
        return all;
    }

    @GetMapping("/template")
    public Object byTemplate() {
        Criteria username = Criteria.where("username").regex("^小红");
        Query query = new Query(username);
        PageRequest page = PageRequest.of(1, 20, Sort.sort(User.class).by(User::getAge).descending());
        query.with(page);
        return PageableExecutionUtils.getPage(template.find(query, User.class), page, () -> template.count(query, User.class));
    }

    @PostMapping("/nest")
    public Object nest(@RequestParam String id) {
        Grade chinese = new Grade("语文", 89);
        Update update = new Update();
        update.push("grades", chinese);
        Query query = new Query(Criteria.where("id").is(id));
        return template.updateFirst(query, update, User.class);
    }

    @PutMapping("/nest")
    public Object update(@RequestParam String id) {
        Update update = new Update();
        update.set("grades.$.score", 100);
        Query query = new Query(Criteria.where("id").is(id)
                .and("grades.score").is(90));
        return template.updateMulti(query,update,User.class);
    }
}
