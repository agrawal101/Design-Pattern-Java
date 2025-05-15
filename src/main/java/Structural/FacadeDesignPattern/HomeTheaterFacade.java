package Structural.FacadeDesignPattern;

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
    public void startPartyMode() {
        System.out.println("Starting Party Mode...");
        light.dim();                       // Keep lights dim
        airConditioner.setTemperature(20);             // Cooler environment
        musicSystem.playAmbientSound();          // Could change to louder music
        // Doors stay unlocked for guests
    }

    public void startMorningRoutine() {
        System.out.println("Starting Morning Routine...");
        light.dim();                       // Or light.brighten()
        airConditioner.setTemperature(24);
        // No music
        securitySystems.lockDoors();              // Maybe unlock instead
    }
}
