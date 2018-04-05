package com.company.adapter.interfaces;

/**
 * Created by mihailkopchev on 4/5/18.
 */
public class Query {


    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //  query class for represeting all the possible fields to in the database

    private String client;
    private int atLeastHoursWorked;

    public Query setClient(String client){
        this.client = client;
        return this;
    }

    public Query setAtLeastHoursWorked(final int hours){
        this.atLeastHoursWorked = hours;
        return this;
    }

    public String getClient() {
        return client;
    }

    public int getAtLeastHoursWorked() {
        return atLeastHoursWorked;
    }
}
