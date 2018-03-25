package com.company.bridge;

/**
 * Created by mihailkopchev on 3/24/18.
 */
public class Main {

    public static void main(String [] args){
        Color green = new Color() {
            @Override
            public String getColor() {
                return "green";
            }
        };

        Shape rectangle = new Rectangle(green);


    }

}
