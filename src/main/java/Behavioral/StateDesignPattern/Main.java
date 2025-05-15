package Behavioral.StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.play();
    }
}
