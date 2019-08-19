package com.smagin.stream.designpatterns.chainofresponsibility.service;

import com.smagin.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.stream.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.stream.designpatterns.chainofresponsibility.model.Payment;

public class Controller implements Handler {
    private Handler handler = null;

    public Controller(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Payment payment) {
        handler.handle(payment);
    }

}
