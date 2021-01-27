package com.ycx.shadingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/28 13:11
 * @description
 **/
@Data
@TableName(value = "user")
public class User {
    private Long userId;
    private String userName;
    private String status;
}
