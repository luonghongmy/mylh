package com.example.demo.api;

import com.example.demo.entity.Student;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentAPI {
    List<Student> students = new ArrayList<>();

    //Thêm sinh viên mới
    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Student student) {
        //student: thông tin của thằng student mới
        students.add(student);
        System.out.println("Create a new student");

        //Trả về thông tin thằng mới được add
        return ResponseEntity.ok(student);
    }

    //Get danh sách sinh viên
    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok(students);
    }
}
