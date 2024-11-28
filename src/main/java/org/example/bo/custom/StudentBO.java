package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.dto.ProgramDTO;
import org.example.dto.StudentDTO;

import java.util.List;

public interface StudentBO extends SuperBO {
    void deleteStudent(StudentDTO studentDTO);
    void updateStudent(StudentDTO studentDTO);
    List<StudentDTO> getAllStudents();
    List<ProgramDTO> getAllPrograms();
    void saveStudent(StudentDTO object, String value, double v);
    StudentDTO getStudent(String studentID);
}
