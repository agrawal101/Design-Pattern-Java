package FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();
        SecuritySystems securitySystems = new SecuritySystems();
        MusicSystem musicSystem = new MusicSystem();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(light,airConditioner,securitySystems,musicSystem);
        homeTheaterFacade.movieNight();
    }
}
