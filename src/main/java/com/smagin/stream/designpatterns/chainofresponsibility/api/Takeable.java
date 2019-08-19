package com.smagin.stream.designpatterns.chainofresponsibility.api;

import com.smagin.designpatterns.chainofresponsibility.model.Payment;

public interface Takeable {
    void takeProcent(Payment payment);
}
