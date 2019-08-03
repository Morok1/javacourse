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
    public boolean handleRequest(Handler handler) {
        taker.takeProcent();
        return false;
    }
}
