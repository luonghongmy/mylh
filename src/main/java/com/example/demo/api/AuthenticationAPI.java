package com.example.demo.api;

import com.example.demo.entity.Account;
import com.example.demo.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthenticationAPI {

    //DI: Dependency Injection

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity register(@Valid @RequestBody Account account) {
        Account newAccount = authenticationService.register(account);
        return ResponseEntity.ok(newAccount);
    }

    @GetMapping("/account")
    public ResponseEntity getAccount() {
        List<Account> list = authenticationService.getAllAccount();
        return ResponseEntity.ok(list);
    }
}
