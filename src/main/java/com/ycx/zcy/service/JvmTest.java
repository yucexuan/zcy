package com.ycx.zcy.service;

/**
 * @author yucexuan
 * @version 1.0
 * @date 2021/1/28 22:41
 */
public class JvmTest {

    int i = 1;

    private static final String a = "小红";
    public void test1(){
        i++;
    }

    public void test2(){
        test1();
    }
}
