package com.company.bridge1;

import java.util.List;

/**
 * Created by mihailkopchev on 3/24/18.
 */
public class MoviePrinter extends Printer {

    private Movie movie;

    @Override
    public String getHeader() {
        return movie.toString();
    }

    @Override
    public List<String> getDetails() {
        return movie.getDetauls();
    }
}
