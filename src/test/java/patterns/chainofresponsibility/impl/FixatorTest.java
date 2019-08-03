package patterns.chainofresponsibility.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
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
        fixator.fix();
        //test

    }

    @Test
    public void handleRequest() {
    }
}