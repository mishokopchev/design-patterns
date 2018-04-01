package com.company.decorator;

/**
 * Created by mihailkopchev on 4/1/18.
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "bread";
    }
}
