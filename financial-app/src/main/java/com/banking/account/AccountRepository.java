package com.banking.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface AccountRepository extends JpaRepository<Account, UUID> {
}
