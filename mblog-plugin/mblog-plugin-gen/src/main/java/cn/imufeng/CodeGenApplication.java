package cn.imufeng;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collections;

/**
 * 代码生成工具
 *
 * @author MuFeng
 * @since 2023/6/9 14:36
 */
public class CodeGenApplication {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mblog-test", "root", "root")
                .globalConfig(builder -> builder.author("MuFeng")
                        .outputDir("G:\\Temp\\CodeGen")
                        .commentDate("yyyy-MM-dd HH:mm:ss")
                        .enableSpringdoc()
                        .build())
                .packageConfig(builder -> builder.parent("cn.imufeng")
                        .moduleName("blog")
                        .entity("pojo")
                        .service("service")
                        .serviceImpl("service.impl")
                        .controller("controller")
                        .xml("mapper")
                        .pathInfo(Collections.singletonMap(OutputFile.xml,"G:\\Temp\\CodeGen\\mapping")))
                .strategyConfig(builder -> builder
                        /* 全局配置 */
                        .addTablePrefix("mb_")

                        /* 实体配置 */
                        .entityBuilder()
                        .enableLombok()
                        .enableFileOverride()

                        /* 持久层配置 */
                        .mapperBuilder()
                        .enableFileOverride()
                        .enableBaseResultMap()
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sMapper")
                        .mapperAnnotation(Mapper.class)
                        .formatXmlFileName("%sMapper")

                        /* 业务层配置 */
                        .serviceBuilder()
                        .enableFileOverride()
                        .formatServiceFileName("I%sService")
                        .formatServiceImplFileName("%sServiceImpl")

                        /* 接口层配置 */
                        .controllerBuilder()
                        .enableFileOverride()
                        //.superClass(BaseController.class)
                        .enableRestStyle()
                        .build())
                .templateConfig(builder ->
                        builder
                                .entity("templates/pojo.java")
                                .controller("templates/controller.java")
                                .service("templates/service.java")
                                .serviceImpl("templates/serviceImpl.java")
                                .mapper("templates/mapper.java")
                                .xml("templates/mapper.xml")
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();

    }
}
