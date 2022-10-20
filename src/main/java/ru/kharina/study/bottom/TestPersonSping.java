package ru.kharina.study.bottom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonSping {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Person Patrick = context.getBean("Patrick", Person.class);
        Person SpongeBob = context.getBean("SpongeBob", Person.class);
        Person Squidward = context.getBean("Squidward", Person.class);

        System.out.println("SpongeBob "+ SpongeBob.toString() +"\n"+
                "Patrick "+ Patrick.toString() + "\n" +
                "Squidward " + Squidward.toString());

        context.close();
    }
}
