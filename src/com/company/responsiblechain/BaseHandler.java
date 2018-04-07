package com.company.responsiblechain;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public abstract class BaseHandler implements Handler {
    private Handler parentHandler;

    public void setParentHandler(Handler handler) {
        if (handler != null) {
            this.parentHandler = handler;
        }
    }

    public void chain(Request request) {
        if (parentHandler != null) {
            this.parentHandler.doHandler(request);
        }

    }


    public abstract void doHandler(Request request);
}
