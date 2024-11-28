package org.example.dao.custom.impl;

import org.example.dao.custom.EnrollementDAO;
import org.example.entity.Enrollment;
import org.example.exception.InUserException;

public class EnrollmentDAOImpl implements EnrollementDAO {
    @Override
    public void save(Enrollment enrollment) {
    }

    @Override
    public void update(Enrollment enrollment) {
    }

    @Override
    public void delete(Enrollment enrollment) throws InUserException {
    }

    @Override
    public Enrollment getAll(Enrollment enrollment) {
        return null;
    }

    @Override
    public Enrollment findById(int id) {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }
}
