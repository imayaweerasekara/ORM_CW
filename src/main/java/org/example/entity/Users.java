package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    @Column(nullable = false,unique=true)
    private String UserName;
    private String Password;
    private String role;

    public Users(String userName, String password, String role) {
        this.UserName = userName;
        this.Password = password;
        this.role = role;
    }

}

