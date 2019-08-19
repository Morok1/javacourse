package com.smagin.stream.designpatterns.state.api;

public interface IState {
    void start();
    void process();
    void finish();
}
