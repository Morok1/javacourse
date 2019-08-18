package patterns.strategy;

import patterns.strategy.api.Unitable;
import patterns.strategy.model.Elph;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unitable> unitables = new ArrayList<>();
        unitables.add(new Elph());
        unitables.stream().forEach(Unitable::doAction);
        }
}
