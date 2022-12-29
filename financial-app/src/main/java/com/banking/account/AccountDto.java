package com.banking.account;


import java.math.BigDecimal;
import java.util.UUID;

record AccountDto(UUID id, BigDecimal accountBalance, boolean isEnabled){}
