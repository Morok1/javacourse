package patterns.chainofresponsibility.impl;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import patterns.chainofresponsibility.api.Handler;
import patterns.chainofresponsibility.database.Database;
import patterns.chainofresponsibility.model.Payment;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;


@RunWith(MockitoJUnitRunner.class)
public class FixatorTest {
    @Mock
    private Payment payment;

    private Fixator fixator;

    @Mock
    private Handler handler;


    @Mock
    private Taker taker;

    @Mock
    private Database database;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(FixatorTest.class);

        fixator = new Fixator(database, taker);
    }

    @Test
    public void fix() {
        //prepare
        doNothing().when(database).fix(any(Payment.class));

        //act
        fixator.fix(payment);

        //test
        Mockito.verify(database).fix(payment);
    }

    @Test
    @Ignore
    //todo
    public void handleRequest() {
        //prepare
        Mockito.when(payment.getSize()).thenReturn(2);
        Mockito.when(handler.handleRequest(any(), any())).thenReturn(Boolean.TRUE);
        Mockito.when(taker.handleRequest(any(), any())).thenReturn(true);
        doNothing().when(database).fix(any(Payment.class));

        //act
        fixator.handleRequest(handler, payment);

        //test
        Mockito.verify(taker).handleRequest(any(), any());
    }
}