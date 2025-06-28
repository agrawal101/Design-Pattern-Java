package structural.ProxyDesignPattern;

public class Main {

    public static void main(String[] args) {
        Image img1 = new ProxyImage("Image1.png");
        Image img2 = new ProxyImage("Image2.png");
        img1.display();
        img2.display();
        img1.display();
    }

}
