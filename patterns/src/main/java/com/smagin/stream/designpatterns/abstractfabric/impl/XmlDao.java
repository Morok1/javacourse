package com.smagin.stream.designpatterns.abstractfabric.impl;

import com.smagin.designpatterns.abstractfabric.model.XmlFile;
import com.smagin.designpatterns.abstractfabric.api.DAO;
import com.smagin.stream.designpatterns.abstractfabric.api.DAO;

public class XmlDao implements DAO<XmlFile> {
    @Override
    public boolean create(XmlFile object) {
        return false;
    }

    @Override
    public boolean save(XmlFile object) {
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
