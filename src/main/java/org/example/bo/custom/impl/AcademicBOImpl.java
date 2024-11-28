package org.example.bo.custom.impl;

import org.example.bo.custom.AcademicBO;
import org.example.dto.ProgramDTO;

import java.util.List;

public class AcademicBOImpl implements AcademicBO {
    @Override
    public void saveProgram(ProgramDTO programDTO) {

    }

    @Override
    public void deleteProgram(ProgramDTO programDTO) {

    }

    @Override
    public void updateProgram(ProgramDTO programDTO) {

    }

    @Override
    public List<ProgramDTO> getAllProgram() {
        return List.of();
    }

    @Override
    public ProgramDTO getProgram(String programID) {
        return null;
    }

    @Override
    public void registerStudentToProgram(String studentId, String programName, double installment) {

    }

    @Override
    public Long getProgramCount() {
        return 0;
    }

    @Override
    public List<ProgramDTO> getAllCullinaryProgram() {
        return List.of();
    }
}
