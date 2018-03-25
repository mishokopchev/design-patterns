package com.company.bridge1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihailkopchev on 3/24/18.
 */
public class Movie {

    private String name;
    private int budget;
    private String Producer;

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public List<String> getDetauls(){
        return new ArrayList<String>();
    }
}
