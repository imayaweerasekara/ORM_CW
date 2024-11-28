package org.example.dao.custom;

import org.example.dao.SuperDAO;
import org.example.entity.Student;

import java.util.List;

public interface QueryDAO extends SuperDAO {

    List<Student> getAllProgramStudents();
    List<Object[]> getAllEqualByProgramName(String programName);
}
