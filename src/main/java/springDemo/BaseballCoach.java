package springDemo;

public class BaseballCoach implements Coach {

//    define a private field for the dependency
private FortuneService fortuneService;
//      define a constructor for dependency Injection
//    Constructor Based Dependency Injection
public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
}
    @Override
    public String getDailyWorkout(){
        return "Spend 30 Minutes on Batting Practice";
    }


    @Override
    public String getDailyFortune() {
//    Use my fortuneService class to get a fortune
        return fortuneService.getFortune();
    }


}
