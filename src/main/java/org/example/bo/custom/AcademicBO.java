package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.dto.ProgramDTO;

import java.util.List;

public interface AcademicBO extends SuperBO {
    void saveProgram(ProgramDTO programDTO);
    void deleteProgram(ProgramDTO programDTO);
    void updateProgram(ProgramDTO programDTO);
    List<ProgramDTO> getAllProgram();
    ProgramDTO getProgram(String programID);

    //Add program to student
    void registerStudentToProgram(String studentId, String programName, double installment);
    Long getProgramCount();

    List<ProgramDTO> getAllCullinaryProgram();
}
