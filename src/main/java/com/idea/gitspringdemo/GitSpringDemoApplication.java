package com.idea.gitspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitSpringDemoApplication.class, args);
        System.out.println("33333333");
        System.out.println("master commit 3");
        System.out.println("hub commit 1");
        System.out.println("master commit 4");
        System.out.println("hub commit 2");
    }

}
