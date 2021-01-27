package com.ycx.mybatis;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yucexuan <yu.cexuan@chinaott.net>
 * @date 2020/12/10 15:06
 * @description
 **/
public class Mybatis {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        boolean overwrite = true;
        File file = new File("generator.xml");
        ConfigurationParser parser = new ConfigurationParser(list);
        Configuration configuration = parser.parseConfiguration(file);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, list);
        generator.generate(null);

    }

    @Test
    public void demo() throws ParseException {
        /**
         * 生成DateFormat类对象的固定格式
         * */
        DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
/**
 * 获取日期转换为Unix时间戳
 */
        long epoch = df.parse("2015-09-09 0:0:0").getTime();
        System.out.println(epoch);
//1420777414000

/**
 * 根据Unix时间戳得到时间
 * */
        Date d = new Date(epoch);
/**
 * 转换为日期
 */
        String t = df.format(d);
        System.out.println(t + " " + epoch);
    }
}

