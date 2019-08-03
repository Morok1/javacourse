package patterns.chainofresponsibility.impl;

import patterns.chainofresponsibility.api.Fixable;
import patterns.chainofresponsibility.api.Handler;
import patterns.chainofresponsibility.database.Database;
import patterns.chainofresponsibility.model.Payment;

public class Fixator implements Fixable, Handler {
    private Taker taker;
    private Database database;

    public Fixator(Database database, Taker taker) {
        this.database = database;
        this.taker = taker;
    }

    @Override
    public void fix(Payment payment) {
        database.fix(payment);
    }

    @Override
    public boolean handleRequest(Handler handler, Payment payment) {
        boolean flag  = payment == null ? fixModern(payment) : false;
        if(flag){
            handler.handleRequest(this.taker, payment);
            return true;
        }
        return false;

    }

    private boolean fixModern(Payment payment) {
        fix(payment);
        return true;
    }
}
