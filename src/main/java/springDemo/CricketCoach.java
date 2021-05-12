package springDemo;

public class CricketCoach implements Coach{
//    Fields
    private String emailAddress;
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : Inside Setter Method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : Inside Setter Method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    private FortuneService fortuneService;
//Our setter Method , which will be called by spring for Dependency Injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach : Inside Setter Method - setFortuneService");
    }

    //    Create NO arg constructor
    public CricketCoach() {
        System.out.println("Cricket Coach : Inside no arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast Bowling for 15 Minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
