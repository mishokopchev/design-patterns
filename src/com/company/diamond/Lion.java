package com.company.diamond;

/**
 * Created by mihailkopchev on 4/1/18.
 */
public class Lion implements Predator, Mammal {

    private Mammal mammal;
    private Predator predator;


    public Lion(Mammal mammal, Predator predator) {
        this.mammal = mammal;
        this.predator = predator;
    }

    @Override
    public void Animal() {

    }

    @Override
    public void mammal() {
        mammal.mammal();
    }

    @Override
    public void predator() {
        predator.predator();
    }

    @Override
    public void doIt() {
        System.out.println("koj e toq de sq");
    }

}
