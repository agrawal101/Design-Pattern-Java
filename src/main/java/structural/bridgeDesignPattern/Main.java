package structural.bridgeDesignPattern;

public class Main {


    public static void main(String[] args) {
        VideoPlayer player1 = new WebPlayer(new UltraHDQuality());
        player1.play("Dangal");

        VideoPlayer player2 = new MobilePlayer(new k8Quality());
        player2.play("Ant Man");
    }

}
