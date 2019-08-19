package com.smagin.stream.designpatterns.strategy;

import com.smagin.designpatterns.strategy.api.Sort;
import com.smagin.stream.designpatterns.strategy.api.Sort;

public class SortService {
    private  final Sort sort;


    public SortService(Sort sort) {
        this.sort = sort;
    }


}
