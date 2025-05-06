package FacadeDesignPattern;

public class HomeTheaterFacade {
    private Light light;
    private MusicSystem musicSystem;
    private SecuritySystems securitySystems;
    private AirConditioner airConditioner;

    public HomeTheaterFacade(Light light,AirConditioner airConditioner,SecuritySystems securitySystems,MusicSystem musicSystem)
    {
        this.airConditioner = airConditioner;
        this.light = light;
        this.musicSystem = musicSystem;
        this.securitySystems = securitySystems;
    }

    public void movieNight()
    {
        light.dim();
        musicSystem.playAmbientSound();
        securitySystems.lockDoors();
        airConditioner.setTemperature(22);
    }
}
