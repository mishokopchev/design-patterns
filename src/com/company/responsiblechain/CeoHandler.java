package com.company.responsiblechain;

/**
 * Created by mihailkopchev on 4/6/18.
 */
public class CeoHandler extends BaseHandler {

    @Override
    public void setParentHandler(Handler handler) {
        super.setParentHandler(handler);
    }

    @Override
    public void doHandler(Request request) {
        if(request != null){
            super.chain(request);
        }

    }
}
