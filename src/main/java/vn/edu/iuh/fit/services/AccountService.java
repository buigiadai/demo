package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void saveAccount(Account account){
        accountRepository.save(account);
    }
}
