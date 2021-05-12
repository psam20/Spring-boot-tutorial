package springDemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(){}
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it " + fortuneService.getFortune();
    }

//    add Init Method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
//  add a Destroy Method
    public void  doMyCleanUpStuff(){
        System.out.println("TrackCoach: inside my cleanup method");
    }


}
