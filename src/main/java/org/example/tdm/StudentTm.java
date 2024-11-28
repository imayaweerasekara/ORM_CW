package org.example.tdm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.Buffer;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class StudentTm {
    private String studentId;
    private String name;
    private String address;
    private Long tel;
    private Date registaionrDate;
    private Button program;


}
