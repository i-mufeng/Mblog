package cn.imufeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主启动类
 *
 * @author MuFeng
 * @since 2023/6/8 16:42
 */
@Slf4j
@RestController
@SpringBootApplication
public class Application {

    /* 解决druid 日志报错：discard long time none received connection:xxx */
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
        log.info(">>> 服务启动成功！");
    }

    @GetMapping("/")
    public String welcome() {
        return "欢迎访问Mblog!";
    }

}
