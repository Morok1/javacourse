package patterns.abstractfabric.impl;

import patterns.abstractfabric.model.XmlFile;
import patterns.abstractfabric.api.DAO;

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
