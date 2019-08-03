package patterns.abstractfabric;

import patterns.abstractfabric.api.DAO;

public abstract class AbstractFactory {
    public abstract DAO createDao();
}
