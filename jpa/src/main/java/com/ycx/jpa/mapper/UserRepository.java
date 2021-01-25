package com.ycx.jpa.mapper;

import com.ycx.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/15 13:56
 * @description
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Modifying
    @Query(value = "update user set name = ?1 where id = ?4",nativeQuery = true)
    //@SQLInsert(sql = )
    int updateById(String name,int id);

    @Query(value = "select p.* from user p where username = ?1 ",nativeQuery = true)
    User findUser(@Param("username")String username);
}
