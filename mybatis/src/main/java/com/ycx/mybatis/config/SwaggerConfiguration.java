package com.ycx.mybatis.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liyi <li.yi@chinaott.net>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("练习接口文档")
                        .description("API文档")
                        .contact(new Contact("平台研发部", null, null))
                        .version("版本号：1.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ycx.mybatis.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
