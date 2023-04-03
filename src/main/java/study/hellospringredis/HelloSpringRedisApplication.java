package study.hellospringredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HelloSpringRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringRedisApplication.class, args);
    }

}
