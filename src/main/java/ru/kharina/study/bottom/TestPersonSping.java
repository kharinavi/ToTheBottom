package ru.kharina.study.bottom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonSping {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person Patrick = context.getBean("person", Person.class);
        Patrick.setNameAge("Patrick",40);
        Person SpongeBob = context.getBean("person", Person.class);
        SpongeBob.setNameAge("SpongeBob",60);
        Person Squidward = context.getBean("person", Person.class);
        Squidward.setNameAge("Squidward",80);

        System.out.println("SpongeBob "+ SpongeBob.toString() +"\n"+
                "Patrick "+ Patrick.toString() + "\n" +
                "Squidward " + Squidward.toString());

        context.close();
    }
}
