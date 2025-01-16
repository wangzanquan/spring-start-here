package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());

//        Parrot p = context.getBean("parrot2",Parrot.class);
//        System.out.println(p.getName());
//
//        String h = context.getBean(String.class);
//        System.out.println(h);
//
//        Integer n = context.getBean(Integer.class);
//        System.out.println(n);
    }
}