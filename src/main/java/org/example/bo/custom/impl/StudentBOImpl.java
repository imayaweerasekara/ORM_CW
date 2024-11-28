package org.example.bo.custom.impl;

import org.example.bo.custom.StudentBO;
import org.example.dto.ProgramDTO;
import org.example.dto.StudentDTO;

import java.util.List;

public class StudentBOImpl implements StudentBO {
    @Override
    public void deleteStudent(StudentDTO studentDTO) {

    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {

    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }

    @Override
    public List<ProgramDTO> getAllPrograms() {
        return List.of();
    }

    @Override
    public void saveStudent(StudentDTO object, String value, double v) {

    }

    @Override
    public StudentDTO getStudent(String studentID) {
        return null;
    }
}
