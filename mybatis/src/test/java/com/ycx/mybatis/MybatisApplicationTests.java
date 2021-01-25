package com.ycx.mybatis;

import com.ycx.mybatis.model.Class;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootTest
class MybatisApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args)throws Exception {
		List<String> list = new ArrayList<>();
		boolean overwrite = true;
		File file = new File("D:\\Code\\idea\\zcy\\mybatis\\src\\test\\java\\com\\ycx\\mybatis\\generator.xml");
		ConfigurationParser parser = new ConfigurationParser(list);
		Configuration configuration = parser.parseConfiguration(file);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, list);
		generator.generate(null);

	}

	@org.junit.Test
	public void test(){
		System.out.println(LocalDateTime.now());
	}

}
