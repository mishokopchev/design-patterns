package com.company.factory;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class BlogWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CarPage());
    }


}
