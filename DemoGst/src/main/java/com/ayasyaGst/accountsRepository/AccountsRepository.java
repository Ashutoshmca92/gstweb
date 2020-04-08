package com.ayasyaGst.accountsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.accounts.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long>{

}
