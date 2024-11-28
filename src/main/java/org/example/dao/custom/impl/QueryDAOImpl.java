package org.example.dao.custom.impl;

import org.example.dao.custom.QueryDAO;
import org.example.entity.Student;

import java.util.List;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public List<Student> getAllProgramStudents() {
        return List.of();
    }

    @Override
    public List<Object[]> getAllEqualByProgramName(String programName) {
        return List.of();
    }
}
