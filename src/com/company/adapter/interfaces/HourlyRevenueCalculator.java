package com.company.adapter.interfaces;

/**
 * Created by mihailkopchev on 4/4/18.
 */
public class HourlyRevenueCalculator implements RevenueCalculator {
    private final double hourlyRate;

    public HourlyRevenueCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(ClientEngagement clientEngagement) {
        return clientEngagement.getValue() * hourlyRate;
    }
}
