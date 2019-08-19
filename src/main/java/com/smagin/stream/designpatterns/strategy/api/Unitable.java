package com.smagin.stream.designpatterns.strategy.api;

import com.smagin.designpatterns.strategy.command.Command;

public interface Unitable {
    void doAction(Command command);
}
