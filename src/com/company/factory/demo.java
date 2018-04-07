package com.company.factory;

import java.util.Calendar;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class demo {
    public static void main(String[] args) {

        Website website = WebsiteFactory.getInstance().createWebsite("misho");
        System.out.println(website);
    }
}
