package com.company.adapter;

/**
 * Created by mihailkopchev on 3/22/18.
 */
public class EmployeeLDAPAdapter implements Employee{

    private EmployeeLDAP instance;

    public EmployeeLDAPAdapter(EmployeeLDAP instance) {
        this.instance = instance;
    }


    @Override
    public long getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getName();
    }

    @Override
    public String getLastName() {
        return instance.getName();
    }
}
