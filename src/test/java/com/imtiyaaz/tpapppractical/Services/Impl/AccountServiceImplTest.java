/*package com.imtiyaaz.tpapppractical.Services.Impl;


import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Factories.AccountFactory;
import com.imtiyaaz.tpapppractical.Services.AccountService;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


  Created by Ameer on 2017/08/14.
 */

/*
public class AccountServiceImplTest {
    AccountService service;
    Map<String, String> values;
    Client client;

    @Before
    public void setUp() throws Exception {
        service = new AccountServiceImpl();
        List<Client> ClientList;
        values = new HashMap<String, String>();
        client = new Client.Builder()
                .build();
        values.put("AccountType", "Savings");
        values.put("Date", " ");
        values.put("AccountNumber", "1234567");
    }

    @Test
    public void create() throws Exception {
        Account account = AccountFactory.getAccount(values, 200.00, client);
        service.create(account);
        assertEquals(200.00, account.getAccBalance());
    }

    @Test
    public void update() throws Exception {
        Account account = service.read("200.00");
        Account newAccount = new Account.Builder()
                .accountType((String) values.get("AccountType"))
                .client(values.get("Client"))
                .accountNumber((String)(values.get("AccountNumber")))
                .build();

        service.update(newAccount);
        Account UpdateAccount = service.read("35353");
        assertEquals(200.00, UpdateAccount.getAccBalance());
    }

    @Test
    public void delete() throws Exception {
        service.delete("32132");
        Account account = service.read("34334");
        assertNull(account);
    }

}
*/