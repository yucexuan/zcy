package com.ycx.jpa.controller;

import com.ycx.jpa.mapper.UserRepository;
import com.ycx.jpa.model.User;
import com.ycx.jpa.service.UserService;
import com.ycx.starter.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/15 14:25
 * @description
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PersonService personService;

    @GetMapping(path = "/byName")
    public User findByName(@RequestParam String username){
        return userService.findByName(username);
    }

    @PutMapping("/update")
    public void update(@RequestParam String username,@RequestParam Integer id){
        userService.UpdateById(username,id);
    }

    @PostMapping("/batch")
    public void batchSave(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
          String sex =  Objects.equals(1,i%2)?"男":"女";
            User user = new User();
            user.setAddress("北京"+i);
            user.setBirthday(new Date());
            user.setSex(sex);
            user.setUsername("小红"+i);
            users.add(user);
        }
        userRepository.saveAll(users);
    }

    @GetMapping("/starter")
    public String starter(){
        return personService.say();
    }
}
