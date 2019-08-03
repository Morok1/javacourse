package patterns.chainofresponsibility.api;

import patterns.chainofresponsibility.model.Payment;

public interface Handler {
    boolean handleRequest(Handler handler, Payment payment);
}
