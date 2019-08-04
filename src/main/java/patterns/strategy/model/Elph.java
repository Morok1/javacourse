package patterns.strategy.model;

import patterns.strategy.api.JumpGoable;

public class Elph implements JumpGoable {
    @Override
    public String go() {
        return "Go elph!";
    }

    @Override
    public String jump() {
        return "Go jump!";
    }

    @Override
    public void doAction() {
        System.out.println(go() + jump());
    }
}
