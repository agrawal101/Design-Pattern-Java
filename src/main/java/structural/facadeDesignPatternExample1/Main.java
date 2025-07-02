package structural.facadeDesignPatternExample1;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        SecuritySystems securitySystems = new SecuritySystems();
        MusicSystem musicSystem = new MusicSystem();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(light,airConditioner,securitySystems,musicSystem);
        System.out.println("Starting Movie....");
        homeTheaterFacade.movieNight();
        System.out.println("Lets Party....");
        homeTheaterFacade.startPartyMode();
        System.out.println("Morning Routine......");
        homeTheaterFacade.startMorningRoutine();
    }
}
