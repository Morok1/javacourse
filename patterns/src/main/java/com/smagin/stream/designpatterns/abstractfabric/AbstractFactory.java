package com.smagin.stream.designpatterns.abstractfabric;

import com.smagin.designpatterns.abstractfabric.api.DAO;
import com.smagin.stream.designpatterns.abstractfabric.api.DAO;

public abstract class AbstractFactory {
    public abstract DAO createDao();
}
