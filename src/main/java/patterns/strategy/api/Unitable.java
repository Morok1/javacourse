package patterns.strategy.api;

import patterns.strategy.command.Command;

public interface Unitable {
    void doAction(Command command);
}
