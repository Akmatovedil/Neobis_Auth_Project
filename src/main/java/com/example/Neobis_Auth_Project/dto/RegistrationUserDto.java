package com.example.Neobis_Auth_Project.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegistrationUserDto {
    private String surname;
    private String name;
    private LocalDate birthdayDay;
    private String phoneNumber;
    private String username;
    private String password;
    private String email;
}
