package org.example.dao.custom.impl;

import org.example.dao.custom.UserDAO;
import org.example.entity.Users;
import org.example.exception.InUserException;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(Users users) {

    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void delete(Users users) throws InUserException {

    }

    @Override
    public Users getAll(Users users) {
        return null;
    }

    @Override
    public Users findById(int id) {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }
}
