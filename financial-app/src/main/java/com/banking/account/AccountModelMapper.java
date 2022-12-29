package com.banking.account;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface AccountModelMapper {

    Account accountDtoToAccount(CreateAccountDto createAccountDto);
    AccountDto accountToAccountDto(Account account);
}