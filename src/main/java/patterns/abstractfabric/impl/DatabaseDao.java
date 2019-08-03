package patterns.abstractfabric.impl;

import patterns.abstractfabric.model.Database;
import patterns.abstractfabric.api.DAO;

public class DatabaseDao implements DAO<Database> {
    @Override
    public boolean create(Database object) {
        return false;
    }

    @Override
    public boolean save(Database object) {
        return false;
    }

    @Override
    public boolean update(Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
