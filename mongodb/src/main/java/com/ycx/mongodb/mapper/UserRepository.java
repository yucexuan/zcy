package com.ycx.mongodb.mapper;

import com.ycx.mongodb.bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/13 13:40
 * @description
 **/
public interface UserRepository extends MongoRepository<User,String>{

}
