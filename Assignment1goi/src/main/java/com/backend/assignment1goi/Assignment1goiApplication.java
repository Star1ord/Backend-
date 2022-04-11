package com.backend.assignment1goi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment1goiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1goiApplication.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());

        context.close();
    }

}
