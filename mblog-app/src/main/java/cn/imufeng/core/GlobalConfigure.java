package cn.imufeng.core;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置
 *
 * @author MuFeng
 * @since 2023/6/9 10:54
 */
@Configuration
public class GlobalConfigure {
    @Bean
    public OpenAPI mblogOpenapiConfigure() {
        return new OpenAPI()
                .info(new Info()
                        .title("沐风的个人博客")
                        .description("欢迎访问https://blog.imufeng.cn")
                        .version("1.0.0")
                        .license(new License().name("Apache 2.0").url("https://blog.imufeng.cn"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Mblog官方文档")
                        .url("https://blog.imufeng.cn")
                );
    }
}
