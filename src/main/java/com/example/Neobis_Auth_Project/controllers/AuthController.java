package com.example.Neobis_Auth_Project.controllers;

import com.example.Neobis_Auth_Project.dto.JwtRequest;
import com.example.Neobis_Auth_Project.dto.RegistrationUserDto;
import com.example.Neobis_Auth_Project.service.AuthService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.Neobis_Auth_Project.config.SwaggerConfig.AUTH;


@Api(tags = AUTH)
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);
    }

    @GetMapping("/activate")
    public ResponseEntity<String> activateUserAccount(@RequestParam("token") String token) {
        authService.activateUserByToken(token);
        return ResponseEntity.ok("Активация аккаунта прошла успешно!");
    }
}
