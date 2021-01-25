package com.ycx.jpa;

import com.ycx.jpa.mapper.UserRepository;
import com.ycx.jpa.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.domain.*;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

@SpringBootTest
class JpaApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("0");
        ExampleMatcher username = ExampleMatcher.matching()
                .withMatcher("username",p->p.contains())
                .withMatcher("sex",p->p.endsWith());
               // .withIgnoreNullValues();
        Example<User> of = Example.of(user, username);
        Sort sort = Sort.sort(User.class).by(User::getId).descending();
        List<User> all = userRepository.findAll(of, sort);
        all.forEach(System.out::println);
    }

    @Test
    public void sort(){
        Sort by = Sort.by(Sort.Direction.DESC, "id", "username");
        Sort sort = Sort.sort(User.class).by(User::hashCode).descending();
        PageRequest pageRequest = PageRequest.of(2, 4, Sort.Direction.DESC, "id");
        Page<User> all = userRepository.findAll(pageRequest);
        long totalElements = all.getTotalElements();
        List<User> collect = all.get().collect(Collectors.toList());
        System.out.println("总的数量为："+totalElements);
        System.out.println(collect);
    }

}
