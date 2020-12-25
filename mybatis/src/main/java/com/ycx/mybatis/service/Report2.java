package com.ycx.mybatis.service;

import org.springframework.stereotype.Component;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/23 9:35
 * @description
 **/
@Component
public class Report2 implements ReportService {
    @Override
    public void print() {
        System.out.println("执行了Report2");
    }
}
