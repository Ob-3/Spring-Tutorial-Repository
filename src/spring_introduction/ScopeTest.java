package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = (Dog) context.getBean("dog", Dog.class);
        myDog.say();

//        Dog youngDog = (Dog) context.getBean("dog", Dog.class);
//        System.out.println("Переменные ссылаются на один объект? " + (myDog == youngDog));

        context.close();

    }
}
