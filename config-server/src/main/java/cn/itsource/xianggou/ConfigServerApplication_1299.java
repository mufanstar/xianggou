package cn.itsource.xianggou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication_1299 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication_1299.class, args);
    }
}
