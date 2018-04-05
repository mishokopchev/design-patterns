package com.company.adapter.interfaces;

import sun.jvm.hotspot.jdi.IntegerTypeImpl;
import sun.rmi.transport.ObjectTable;

import javax.management.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class main {

    public static void main(String[] args) {

//        RevenueCalculator calculator = new HourlyRevenueCalculator(100);
//        ClientEngagement clientEngagement = new ClientEngagement("1", 2, 3);
//        ClientEngagement clientEngagement1 = new ClientEngagement("1", 2, 3);
//        ClientEngagement clientEngagement2 = new ClientEngagement("1", 2, 3);
//        ClientEngagement clientEngagement3 = new ClientEngagement("1", 2, 3);
//
//        List<ClientEngagement> clientEngagements = Arrays.asList(clientEngagement, clientEngagement1, clientEngagement2, clientEngagement3);
//        SalesAgent salesAgent = new SalesAgent();;
//        Double a  = (Double)salesAgent.calculatePrice(clientEngagements, clientEng -> clientEng.getValue() * 3);
//
//        System.out.println(a);
//

//        Integer i1 = 2;
//        List<Integer> list = new ArrayList<>();
//        Integer i = 2;
//        Integer i2 = 2;
//
//        i1 = i2;
//        i1.shortValue();
//
//        list.add(i1);
//        list.add(i2);
//        list.add(i);
//
//        Integer i3 = list.get(0);
//
//
//        for (Integer integer : list) {
//            System.out.println(integer.hashCode());
//        }


        Query query = new Query()
                .setAtLeastHoursWorked(12)
                .setClient("Misho");


    }

}
