package com.smagin.stream.designpatterns.strategy.api;

import java.util.List;

public interface Sort<E> {
    List<E> sort(List<E> list);
}
