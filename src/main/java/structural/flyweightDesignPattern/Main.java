package structural.flyweightDesignPattern;

public class Main {

    public static void main(String[] args) {
        Forest forest = new Forest();
        for(int i = 0;i<=1000;i++)
        {
            forest.plantTree(i,i+1,"Rose","Pink","Smooth");
        }
        System.out.println("Planted 1000 trees");
    }
}
