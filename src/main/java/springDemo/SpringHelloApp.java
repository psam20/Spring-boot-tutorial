package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
//        Load the Configuration File
        ClassPathXmlApplicationContext context=new
                ClassPathXmlApplicationContext("beans.xml");

//        Retrieve the Bean from Spring Container
        Coach theCoach=context.getBean("myCoach",Coach.class);
//        Call methods on the Bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        Close the Context
        context.close();
    }
}
