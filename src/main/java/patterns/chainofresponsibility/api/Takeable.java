package patterns.chainofresponsibility.api;

import patterns.chainofresponsibility.model.Payment;

public interface Takeable {
    void takeProcent(Payment payment);
}
