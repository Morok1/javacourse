package com.smagin.stream.designpatterns.abstractfabric.api;

public interface DAO<T> {
    boolean create(T object);
    boolean save(T object);
    boolean update(Long id);
    boolean delete(Long id);


}
