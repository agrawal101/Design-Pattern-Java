package structural.adaptorDesignPatternExample2.client;

import org.w3c.dom.ls.LSOutput;
import structural.adaptorDesignPatternExample2.adaptee.WeighingMachine;
import structural.adaptorDesignPatternExample2.adaptee.WeighingMachingImpl;
import structural.adaptorDesignPatternExample2.adaptor.WeighingMachineAdaptor;
import structural.adaptorDesignPatternExample2.adaptor.WeighingMachineAdaptorImpl;

public class Main {

    public static void main(String[] args) {
        WeighingMachine weighingMachine = new WeighingMachingImpl();
        WeighingMachineAdaptor weighingMachineAdaptor = new WeighingMachineAdaptorImpl(weighingMachine);

        System.out.println(weighingMachineAdaptor.weightInKgs());
    }


}
