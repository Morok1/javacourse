package com.smagin.stream.designpatterns.chainofresponsibility.impl;

import com.smagin.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.designpatterns.chainofresponsibility.api.Takeable;
import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.stream.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.stream.designpatterns.chainofresponsibility.api.Takeable;
import com.smagin.stream.designpatterns.chainofresponsibility.model.Payment;


public class Taker implements Takeable, Handler {
    private Handler nexthandler;

    public Handler getNexthandler() {
        return nexthandler;
    }

    public void setNexthandler(Handler nexthandler) {
        this.nexthandler = nexthandler;
    }

    public Taker(Handler nexthandler) {

        this.nexthandler = nexthandler;
    }

    @Override
    public void takeProcent(Payment payment) {
        payment.setSize(payment.getSize() - 1);
    }

    @Override
    public boolean handleRequest(Handler handler, Payment payment) {
        if (payment != null) {
            takeProcent(payment);
            nexthandler.handleRequest(handler, payment);
            return true;
        }

        return false;
    }
}
