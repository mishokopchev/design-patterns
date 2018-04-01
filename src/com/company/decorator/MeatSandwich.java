package com.company.decorator;

/**
 * Created by mihailkopchev on 4/1/18.
 */
public class MeatSandwich extends BaseSandwich {

    public MeatSandwich(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String make() {
        return "add ham " + super.make();
    }
}
