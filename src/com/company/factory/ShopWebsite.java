package com.company.factory;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class ShopWebsite extends Website {


    @Override
    public void createWebsite() {
        pages.add(new PostPage());
    }
}
