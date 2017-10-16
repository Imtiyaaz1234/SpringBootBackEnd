package com.imtiyaaz.tpapppractical.Validation;

import com.imtiyaaz.tpapppractical.Domain.Client;

/**
 * Created by Ameer on 2017/09/05.
 */
public class ClientValidation {
    public boolean validate(Client client){
        return validateClientName(client.getcName()) && validateClientCnp(client.getcCnp()) && validateClientEmail(client.getcEmail());

    }

    private boolean validateClientName(String name){
        return name.matches("[a-zA-Z\\s]");

    }

    private boolean validateClientCnp(String cnp){
        return (cnp.startsWith("1") || cnp.startsWith("2") && (cnp.length()== 13));
    }

    private boolean validateClientEmail(String email){
        return email.contains("@") && email.contains(".com");
    }
}
