package com.smagin.stream.designpatterns.strategy;

import com.smagin.designpatterns.strategy.api.Unitable;
import com.smagin.designpatterns.strategy.model.Elph;
import com.smagin.stream.designpatterns.strategy.api.Unitable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unitable> unitables = new ArrayList<>();
        unitables.add(new Elph());
        unitables.stream().forEach(Unitable::doAction);
        }
}
