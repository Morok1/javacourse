package com.smagin.stream.designpatterns.abstractfabric.impl;

import com.smagin.designpatterns.abstractfabric.model.Database;
import com.smagin.designpatterns.abstractfabric.api.DAO;
import com.smagin.stream.designpatterns.abstractfabric.api.DAO;

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
