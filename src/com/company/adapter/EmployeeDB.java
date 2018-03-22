package com.company.adapter;

/**
 * Created by mihailkopchev on 3/22/18.
 */
public class EmployeeDB implements Employee {

    private long id;
    private String firstName;
    private String lastName;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
