package com.imtiyaaz.tpapppractical.Validation;

import com.imtiyaaz.tpapppractical.Domain.Account;

/**
 * Created by Ameer on 2017/09/05.
 */
public class AccountValidation {

        public boolean validAccount(Account account){
            return(validAccountType(account.getAccountType()) && validAccountBalance(account.getAccBalance()));
        }

        private boolean validAccountBalance(double balance){
            return (balance >= Account.getMinRes() &&  balance <= Account.getMaxRes());
        }

        private boolean validAccountType(String type) {
            return type.equalsIgnoreCase("credit") || type.equalsIgnoreCase("debit");
        }

}
