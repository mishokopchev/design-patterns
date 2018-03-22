package com.company.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihailkopchev on 3/22/18.
 */
public class Main {
    public static void main(String[] args){
        //TODO we want to return a list of all employees. but cannot implements ldap to Employee interface cause of legacy code
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new EmployeeDB();
        employeeList.add(employee);

        EmployeeLDAP employeeLDAP = new EmployeeLDAP();
        employeeList.add(new EmployeeLDAPAdapter(employeeLDAP));
        //TODO now employeeldap can be translated to other APIs which work with employee interface

    }


    public static List<Employee> getAllEmployees(){

    }
}
