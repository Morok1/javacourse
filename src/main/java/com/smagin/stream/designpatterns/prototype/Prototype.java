package com.smagin.stream.designpatterns.prototype;

public interface Prototype<T> {
    MockObject clonePrototype(T t);
}
