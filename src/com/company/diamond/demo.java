package com.company.diamond;

import com.company.decorator.BaseSandwich;
import com.company.decorator.MeatSandwich;
import com.company.decorator.Sandwich;
import com.company.decorator.SimpleSandwich;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by mihailkopchev on 4/1/18.
 */
public class demo {

    public static void main(String[] args) {

        Mammal mammal = new Mammal() {
            @Override
            public void mammal() {

            }

            @Override
            public void doIt() {

            }

            @Override
            public void Animal() {
                System.out.println("mammal animal");
            }
        };

        Predator predator = new Predator() {

            @Override
            public void predator() {

            }

            @Override
            public void doIt() {

            }

            @Override
            public void Animal() {
                System.out.println("predator animal");
            }
        };

        Mammal animal = new Lion(mammal, predator);
        animal.mammal();

        Lion lion = new Lion(mammal, predator);

        //       System.out.println(make());
        //OutputStream outputStream = new FileOutputStream(null);
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        Sandwich sandwich = new MeatSandwich(new BaseSandwich(new SimpleSandwich()));
        sandwich.make();

    }

    public static String make() {
        StringBuilder builder = new StringBuilder();
        builder.append("putka");

        try {
            return builder.append("be").toString();
        } finally {
            builder = null;
        }
    }
}
