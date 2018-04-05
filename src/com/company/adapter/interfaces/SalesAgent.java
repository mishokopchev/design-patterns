package com.company.adapter.interfaces;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class SalesAgent {

    public Double calculatePrice(Collection<ClientEngagement> clientEngagements, RevenueCalculator calculator) {
        return clientEngagements.stream().mapToDouble((element) -> calculator.calculate(element)).sum();
    }
}
