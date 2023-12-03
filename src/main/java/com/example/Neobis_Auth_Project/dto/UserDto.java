package com.example.Neobis_Auth_Project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String surname;
    private String name;
    private LocalDate birthdayDay;
    private String phoneNumber;
    private String username;
    private String email;

}
