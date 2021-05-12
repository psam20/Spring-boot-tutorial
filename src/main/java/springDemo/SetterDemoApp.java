package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
//        Load the spring Configuration FIle
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        retreive bean from container
        CricketCoach theCoach=context.getBean("cricketCoach",CricketCoach.class);
//        call methods on the bean

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
//        close the context
        context.close();
    }
}
