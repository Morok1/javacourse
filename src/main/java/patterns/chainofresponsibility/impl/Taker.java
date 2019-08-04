package patterns.chainofresponsibility.impl;

import patterns.chainofresponsibility.api.Handler;
import patterns.chainofresponsibility.api.Takeable;
import patterns.chainofresponsibility.model.Payment;


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
