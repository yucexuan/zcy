package com.ycx.zcy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yucexuan
 * @version 1.0
 * @date 2020/11/30 22:13
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private String gender;
    private Integer age;
}
