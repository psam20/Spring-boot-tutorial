package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
//        load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext
                ("Beans-scope.xml");
//        retreive the bean from the spring container
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);

//        Check if they are the same beans
        boolean result =(theCoach == alphaCoach);
        System.out.println("\nPointing to the Same object "+ result);
        System.out.println("\nMemory location for theCoach "+theCoach);
        System.out.println("\nMemory location for alphaCoach "+alphaCoach);

    }
}
