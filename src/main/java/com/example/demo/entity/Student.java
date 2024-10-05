package com.example.demo.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    @NotBlank(message = "Name can not be blank!")
    String name;
    @NotBlank(message = "Code can not be blank!")
    //SE****** (* = number)
    @Pattern(regexp = "SE\\d{6}", message = "Student code is not valid!")
    String code;
    @Min(value = 0, message = "Score must be at least 0!")
    @Max(value = 10, message = "Score must not be more than 10!")
    float score;
}
