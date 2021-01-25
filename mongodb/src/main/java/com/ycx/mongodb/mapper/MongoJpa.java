package com.ycx.mongodb.mapper;

import com.ycx.mongodb.bean.User;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/14 18:20
 * @description
 **/
public interface MongoJpa extends PagingAndSortingRepository<User,String>,QuerydslPredicateExecutor<User>{
       default User querySql(){
           return null;
       }
}
