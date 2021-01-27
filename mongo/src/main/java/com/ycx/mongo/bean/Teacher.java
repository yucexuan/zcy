package com.ycx.mongo.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author yucexuan
 * @version 1.0
 * @date 2021/1/12 22:45
 */
@Data
@Document(collection = "teacher")
public class Teacher {
    @Id
    private String id;
    private String name;
    private String parent;
    private String desc;
    private Integer sex;
    private String lover;
}
