package com.company.adapter.interfaces;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class ClientEngagement {

    private String name;
    private int value;
    private int anticipate;

    public ClientEngagement(String name, int value, int anticipate) {
        this.name = name;
        this.value = value;
        this.anticipate = anticipate;
    }

    int getValue() {
        return value;
    }
}
