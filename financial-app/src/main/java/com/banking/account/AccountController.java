package com.banking.account;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
class AccountController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    ResponseEntity<AccountDto> getAccount(@PathVariable UUID id){
        return new ResponseEntity<>(accountService.getAccount(id), HttpStatus.OK);
    }

    @GetMapping("/status/{id}")
    ResponseEntity<Boolean> getAccountStatus(@PathVariable UUID id){
        return new ResponseEntity<>(accountService.accountIsEnabled(id), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<AccountDto> create(@RequestBody @Valid CreateAccountDto createAccountDto){
        return new ResponseEntity<>(accountService.createAccount(createAccountDto), HttpStatus.CREATED);
    }
}
