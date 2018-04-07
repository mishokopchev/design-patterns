package com.company.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

}
