package patterns.chainofresponsibility.api;

import patterns.chainofresponsibility.model.Payment;

public interface Fixable {
    void fix(Payment payment);
}
