package com.company.interfaceAndAbstractions;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class AbstractConcrete implements ConcreteInterface {
    private int value;

    public AbstractConcrete(int value) {
        this.value = value;
    }

    @Override
    public void execute() {

    }
    public int getValue(){
        return value;
    }
}
