package com.ycx.mongodb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/12 11:58
 * @description
 **/
@Data
@Document(collection = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    @Id
    private String id;
    private Integer age;
    private List<Grade> grades;
}
