package org.example.bo.custom.impl;

import org.example.bo.custom.RegistaionBO;
import org.example.dto.ProgramDTO;

import java.util.List;

public class RegistrationBOImpl implements RegistaionBO {
    @Override
    public void updateEnrollment(String studentId, String programName, double payment) {

    }

    @Override
    public List<ProgramDTO> getAllPrograms() {
        return List.of();
    }

    @Override
    public List<Object[]> getAllEqualByProgramName(String programName) {
        return List.of();
    }
}
