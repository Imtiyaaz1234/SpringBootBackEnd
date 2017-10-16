package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Client;

import java.util.Map;

/**
 * Created by Imtiyaaz on 2017/08/13.
 */
public class ClientFactory {
    public static Client getClient(Map<String, String> values, int cId){//, int cId, String cCnp, String cIdNumber, String cName, String cEmail, String cPhone, String cAddress){
        Client client = new Client.Builder()
                .cName(values.get("cName"))
                .cEmail(values.get("cEmail"))
                .cId(cId)
                .cCnp(values.get("cCnp"))
                .cIdNumber(values.get("cIdNumber"))
                .cAddress(values.get("cAddress"))
                .cPhone(values.get("cPhone"))
                .build();

        return client;
    }
}
