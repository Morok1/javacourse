package com.smagin.stream.designpatterns.state;

import com.smagin.designpatterns.state.api.IState;

public class Course {
    private IState iState;
    private String name;
    private String teacher;

    public Course(IState iState, String name, String teacher) {
        this.iState = iState;
        this.name = name;
        this.teacher = teacher;
    }

    public void start(){
        iState.start();
    }

    public void process(){
        iState.process();
    }

    public void finish(){
        iState.finish();
    }
}
