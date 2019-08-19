package com.smagin.stream.designpatterns.state.impl;

import com.smagin.designpatterns.state.api.IState;
import com.smagin.designpatterns.state.model.Teacher;
import com.smagin.stream.designpatterns.state.api.IState;
import com.smagin.stream.designpatterns.state.model.Teacher;

public class StartState implements IState {
    private Teacher teacher;

    public StartState(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void start() {

    }

    @Override
    public void process() {

    }

    @Override
    public void finish() {

    }
}
