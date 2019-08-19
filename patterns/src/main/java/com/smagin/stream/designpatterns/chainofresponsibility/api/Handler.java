package com.smagin.stream.designpatterns.chainofresponsibility.api;

import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.stream.designpatterns.chainofresponsibility.model.Payment;

public interface Handler {
    void handle(Payment payment);
}
