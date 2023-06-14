package cn.imufeng.blog.core.config;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 博客模块API接口配置
 *
 * @author MuFeng
 * @since 2023/6/9 10:36
 */
@Configuration
public class BlogApiConfigure {

    @Bean
    public GroupedOpenApi blogApi() {
        return GroupedOpenApi.builder()
                .group("1. 博客模块")
                .packagesToScan("cn.imufeng.blog")
                .build();
    }

}

