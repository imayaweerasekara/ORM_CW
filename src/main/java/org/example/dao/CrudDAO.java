package org.example.dao;

import org.example.exception.InUserException;

public interface CrudDAO<T> extends SuperDAO {
    void save(T t);
    void update(T t);
    void delete(T t) throws InUserException;
    T getAll(T t);
    T findById(int id);
    Long count();

}
