package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        //        load the spring configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext
                ("beans-lifecycle.xml");
//        retrieve the bean from the spring container
        Coach theCoach=context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());
//        close the context
        context.close();
    }
}
