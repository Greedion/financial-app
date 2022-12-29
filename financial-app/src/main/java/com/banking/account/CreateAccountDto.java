package com.banking.account;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


record CreateAccountDto(@DecimalMin(value = "0.0", inclusive = false)
@Digits(integer = 3, fraction = 2) BigDecimal accountBalance, @NotNull Boolean isEnabled){}

