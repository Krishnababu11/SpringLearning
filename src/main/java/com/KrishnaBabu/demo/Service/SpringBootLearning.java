package com.KrishnaBabu.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  SpringBootLearning{

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootLearning.class, args);
        System.out.println("Hello Spring Boot");


    }

}

