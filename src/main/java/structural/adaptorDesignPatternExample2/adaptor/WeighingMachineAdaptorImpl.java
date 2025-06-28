package structural.adaptorDesignPatternExample2.adaptor;

import structural.adaptorDesignPatternExample2.adaptee.WeighingMachine;

public class WeighingMachineAdaptorImpl implements WeighingMachineAdaptor{

    WeighingMachine weighingMachine;

    public WeighingMachineAdaptorImpl(WeighingMachine weighingMachine)
    {
        this.weighingMachine = weighingMachine;
    }
    @Override
    public double weightInKgs()
    {
        return weighingMachine.weightInPounds()*2.2;
    }
}
