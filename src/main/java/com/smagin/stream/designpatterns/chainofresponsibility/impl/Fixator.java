package com.smagin.stream.designpatterns.chainofresponsibility.impl;

import com.smagin.designpatterns.chainofresponsibility.api.Fixable;
import com.smagin.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.designpatterns.chainofresponsibility.database.Database;
import com.smagin.designpatterns.chainofresponsibility.model.Payment;
import com.smagin.stream.designpatterns.chainofresponsibility.api.Fixable;
import com.smagin.stream.designpatterns.chainofresponsibility.api.Handler;
import com.smagin.stream.designpatterns.chainofresponsibility.database.Database;
import com.smagin.stream.designpatterns.chainofresponsibility.model.Payment;

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
