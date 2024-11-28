package org.example.tdm;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ViewAllTm {
    private String studentId;
    private String studentName;
    private Date rejistationDate;
    private double installment;
    private double balance;
    private Button payment;


}
