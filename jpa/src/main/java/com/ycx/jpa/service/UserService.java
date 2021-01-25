package com.ycx.jpa.service;

import com.ycx.jpa.mapper.UserRepository;
import com.ycx.jpa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/15 13:58
 * @description
 **/
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByName(String username) {
        return userRepository.findUser(username);
    }

    public void UpdateById(String name,int id){
        userRepository.updateById(name,id);
    }
}
