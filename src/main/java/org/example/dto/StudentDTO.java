package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.Enrollment;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentDTO {
    private String studentId;
    private String name;
    private String address;
    private Long tel;
    private Date registationDate;
    private List<Enrollment> enrollments;
}
