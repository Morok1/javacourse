package com.smagin.stream.designpatterns.chainofresponsibility;

import com.smagin.designpatterns.chainofresponsibility.model.LimitPayment;
import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.designpatterns.chainofresponsibility.service.Controller;
import com.smagin.designpatterns.chainofresponsibility.service.Fixator;
import com.smagin.stream.designpatterns.chainofresponsibility.model.LimitPayment;

public class Context {
    public static void main(String[] args) {
        Controller controller = new Controller(null);
        Fixator fixator = new Fixator(controller);


        Payment payment = new LimitPayment();

    }
}
