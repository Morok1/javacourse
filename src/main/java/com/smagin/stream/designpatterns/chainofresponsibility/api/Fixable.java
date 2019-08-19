package com.smagin.stream.designpatterns.chainofresponsibility.api;

import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.stream.designpatterns.chainofresponsibility.model.Payment;

public interface Fixable {
    void fix(Payment payment);
}
