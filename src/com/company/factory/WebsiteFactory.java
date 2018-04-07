package com.company.factory;

import java.util.concurrent.Executor;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class WebsiteFactory {

    private static WebsiteFactory instance = new WebsiteFactory();
    private Executor executor;

    private WebsiteFactory() {

    }

    public Website createWebsite(String type) {

        switch (type) {
            case "blog":
                return new ShopWebsite();

            case "car":
                return new BlogWebsite();
        }
        return null;
    }

    public static WebsiteFactory getInstance() {
        return instance;
    }

    public void startThread(Runnable runnable) {
        synchronized (executor) {
            this.executor.execute(runnable);
        }

    }

}
