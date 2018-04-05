package com.company.decorator;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * Created by mihailkopchev on 4/1/18.
 */
public class BaseSandwich implements Sandwich {

    private Sandwich sandwich;

    public BaseSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();

    }
}
