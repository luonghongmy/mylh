package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.exception.DuplicateEntity;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationService {
    @Autowired
    AccountRepository accountRepository;

    public Account register(Account account) {
        Account newAccount = accountRepository.save(account);
        return newAccount;
//        //=> pass  vòng validation
//        boolean isDuplicate = false;
//        if(isDuplicate) {
//            //=> báo lỗi
//            throw new DuplicateEntity("Duplicate email");
//        } else {
//            //lưu vào database
//            return account;
//        }
    }

    public Account login(Account account) {
        return account;
    }

    public List<Account> getAllAccount() {
        List<Account> list = accountRepository.findAll();
        return list;
    }
}
