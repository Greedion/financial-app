package com.banking.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
class AccountService {

    private final AccountModelMapper accountModelMapper;

    private final AccountRepository accountRepository;

    AccountDto createAccount(CreateAccountDto createAccountDto) {
        Account account = accountModelMapper
                .accountDtoToAccount(createAccountDto);
        account = accountRepository.save(account);
        return accountModelMapper.accountToAccountDto(account);
    }

    AccountDto getAccount(UUID id){
        return accountModelMapper.accountToAccountDto(accountRepository.findById(id).orElseThrow());
    }

    Boolean accountIsEnabled(UUID id){
        return accountRepository.findById(id).orElseThrow().isEnabled();
    }

}
