package com.ycx.shadingjdbc.entity;

import lombok.Data;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/23 10:49
 * @description
 **/
@Data
public class Course {
    private Long id;
    private String name;
    private String status;
    private Long userId;
}
