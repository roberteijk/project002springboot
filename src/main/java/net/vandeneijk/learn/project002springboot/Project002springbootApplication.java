package net.vandeneijk.learn.project002springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project002springbootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Project002springbootApplication.class, args);


        Alien obj = ctx.getBean( Alien.class);
        obj.code();
    }

}
