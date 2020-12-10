package com.ycx.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
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
}
