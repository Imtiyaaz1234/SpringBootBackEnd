package com.imtiyaaz.tpapppractical.Validation;


import com.imtiyaaz.tpapppractical.Domain.Account;

/**
 * Created by Ameer on 2017/09/05.
 */
public class TransferValidation {
    public boolean validateTransfer(Account from, Account to, float sum) {
        return ((from.getAccBalance() - sum) >= from.getMinRes()) && ((to.getAccBalance() + sum) <= to.getMaxRes()) && sum > 0;
    }
}
