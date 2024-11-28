package org.example.dto;

import org.example.entity.Enrollment;

import java.util.List;

public class ProgramDTO {
    private String programId;
    private String programName;
    private int duration;
    private double fees;
    private List<Enrollment> enrollments;
}
