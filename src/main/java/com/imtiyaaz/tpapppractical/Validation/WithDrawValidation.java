package com.imtiyaaz.tpapppractical.Validation;

import com.imtiyaaz.tpapppractical.Domain.Account;

/**
 * Created by Ameer on 2017/09/05.
 */
public class WithDrawValidation {
    public boolean validateWithdraw(Account from, float sum){
        return (from.getAccBalance() - sum >= from.getMinRes()) && sum > 0;
    }
}
