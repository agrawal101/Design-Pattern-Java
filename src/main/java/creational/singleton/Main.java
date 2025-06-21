package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        //TvSet tv1 = TvSet.getInstance();
        //TvSet tv2 = TvSet.getInstance();

        //System.out.println(tv1);
        //System.out.println(tv2);

        Runnable task = () -> {
            TvSet instance = TvSet.getInstance();
            System.out.println("Got instance: " + instance.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

    }




}
