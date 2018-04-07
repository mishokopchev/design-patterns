package com.company.responsiblechain;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class DirectorHandler implements Handler {

    private Handler handler;

    @Override
    public void doHandler(Request request) {
        if (request.getRequestType() == "Misho") {
            System.out.println("director can do it!");
        } else {
            handler.doHandler(request);
        }

    }
}
