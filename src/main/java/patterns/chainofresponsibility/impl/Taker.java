package patterns.chainofresponsibility.impl;

import patterns.chainofresponsibility.api.Takeable;
import patterns.chainofresponsibility.model.Payment;

public class Taker implements Takeable {
    @Override
    public void takeProcent(Payment payment) {
        payment.setSize(payment.getSize() - 1);
    }
}
