package com.ycx.mongodb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2021/1/13 17:29
 * @description
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private String subject;
    private Integer score;
}
