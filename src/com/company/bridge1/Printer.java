package com.company.bridge1;

import java.util.List;

/**
 * Created by mihailkopchev on 3/24/18.
 */
public abstract class Printer {

    public String print(Formatter formatter){
        return formatter.format(getHeader(),getDetails());
    }
    public abstract String getHeader();

    public abstract List<String> getDetails();


}
