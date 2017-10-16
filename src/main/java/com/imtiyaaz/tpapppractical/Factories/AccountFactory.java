package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Account;
import com.imtiyaaz.tpapppractical.Domain.Client;

import java.util.Map;

/**
 * Created by Imtiyaaz on 2017/08/13.
 */
public class AccountFactory {

    public static Account getAccount(Map<String, String> values, double accBalance, Client client){
        Account account = new Account.Builder()
                .accountType((String) values.get("AccountType"))
                .client(client)
                .accountNumber((String)(values.get("AccountNumber")))
                .accBalance(accBalance)
                .CreateAccount(values.get("Date"))
                .build();
        return account;
    }


}
