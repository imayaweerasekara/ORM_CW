package org.example.bo.custom;

import org.example.bo.SuperBO;
import org.example.dto.ProgramDTO;

import java.util.List;

public interface RegistaionBO extends SuperBO {
    void updateEnrollment(String studentId, String programName,double payment);

    List<ProgramDTO> getAllPrograms();
    List<Object[]> getAllEqualByProgramName(String programName);
}
