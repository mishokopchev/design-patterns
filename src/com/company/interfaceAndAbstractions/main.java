package com.company.interfaceAndAbstractions;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class main {
    public static void main(String[] args) {
        ConcreteInterface concreteInterface = new Concrete();
        if (concreteInterface instanceof AbstractConcrete) {
            System.out.println(concreteInterface.getClass().getName());
            System.out.println(((AbstractConcrete) concreteInterface).getValue());
        }


    }
}
