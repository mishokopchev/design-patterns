package com.company.bridge1;

import java.util.List;

/**
 * Created by mihailkopchev on 3/24/18.
 */
public class Main {

    public static void main(String[] args) {

        Formatter movieFormatter = new Formatter() {
            @Override
            public String format(String header, List<String> details) {
                StringBuilder builder = new StringBuilder();
                builder.append("Header:" + header);
                ;
                for (String detail : details) {
                    builder.append("\n" + detail);
                }
                return builder.toString();
            }
        };

        Printer printer = new MoviePrinter();
        printer.print(movieFormatter);

    }

}
