package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by User on 14 Aug 2017.
 */
@Component
public class AccountServiceImpl implements AccountService {
   /* private static AccountServiceImpl service = null;

    AccountRepository repo = AccountRepositoryImpl.getInstance();

    public static AccountServiceImpl getInstance(){
        if(service == null)
            service = new AccountServiceImpl();
        return service;
    }
    public Account create(Account account){
        return repo.create(account);
    }

    public Account read(String accountNumber){
        return repo.read(accountNumber);

    }

    public Account update(Account account){
        return repo.update(account);
    }

    public void delete(String accountNumber){
        repo.delete(accountNumber);
    }

    */

    @Qualifier("accountRepository")
    @Autowired
    private AccountRepository repository;

   @Override
    public Account save(Account entity){
       return repository.save(entity);
   }

   @Override
    public Account findById(String s){
        return repository.findOne(s);
   }

    @Override
    public Account update(Account entity)
    {
        return repository.save(entity);
    }

    @Override
    public void delete(Account entity)
    {
        repository.delete(entity);
    }
}
