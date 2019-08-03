package patterns.prototype;

public class ConcretePrototype implements Prototype<MockObject> {

    @Override
    public MockObject clonePrototype(MockObject mo) {
        //there should be implementation of clone function

        return mo;
    }
}
