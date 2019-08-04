package patterns.strategy;

import patterns.strategy.api.Unitable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unitable> unitables = new ArrayList<>();
        unitables.stream().forEach(Unitable::doAction);
        }
}
