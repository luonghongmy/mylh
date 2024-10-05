package com.example.demo.entity;

import com.example.demo.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NotBlank(message = "Code must not be blank!")
    @Pattern(regexp = "KH\\d{6}", message = "Invalid code!")
    String code;
    @Email(message = "Invalid Email!")
    String email;
    @Pattern(regexp = "(84|0[3|5|7|8|9])+([0-9]{8})", message = "Invalid phone!")
    String phone;
    @Size(min = 6, message = "Password must be at least 6 characters!")
    String password;

//    @ValidEnum(enumClass = Gender.class, message = "Invalid gender value. Please use MALE, FEMALE, or OTHER.")
//    private Gender gender;
}
