package me.choi.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 1:57 오전
 */
@SpringBootApplication
public class IntoJavaApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(IntoJavaApplication.class);
//        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }
}
