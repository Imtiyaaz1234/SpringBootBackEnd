/*package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Factories.AccountFactory;
import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by User on 14 Aug 2017.
 */
/*
public class AccountRepositoryImplTest {
    Map<String, String> values;
    AccountRepository repository;
    @Before
    public void setUp() throws Exception {
        repository = AccountRepositoryImpl.getInstance();


        List<Client> ClientList;
        values = new HashMap<String, String>();

        values.put("AccountType", "Savings");
        values.put("Date", " ");
        values.put("AccountNumber", "1234567");
    }




    @Test
    public void create() throws Exception {
        Account account = AccountFactory.getAccount(values, 200.00);
        repository.create(account);
        assertEquals(200.00, account.getAccBalance());

    }


    @Test
    public void update() throws Exception {
        Account account = repository.read("200.00");
        Account newAccount = new Account.Builder()
                .accountType((String) values.get("AccountType"))
                .client(values.get("Client"))
                .accountNumber((String)(values.get("AccountNumber")))
                .build();

        repository.update(newAccount);
        Account UpdateAccount = repository.read("35353");
        assertEquals(200.00, UpdateAccount.getAccBalance());

    }

    @Test
    public void delete() throws Exception {
        repository.delete("32132");
        Account account = repository.read("34334");
        assertNull(account);

    }

}
*/