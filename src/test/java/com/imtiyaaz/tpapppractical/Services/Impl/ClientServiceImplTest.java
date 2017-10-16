/*package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Factories.ClientFactory;
import com.imtiyaaz.tpapppractical.Services.ClientService;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Ameer on 2017/08/14.
 */

/*
public class ClientServiceImplTest {
    ClientService service;
    Map<String, String> values;
    @Before
    public void setUp() throws Exception {
        service = new ClientServiceImpl();
        values = new HashMap<String, String>();

        values.put("cName", "John");
        values.put("cEmail", "JohnDoe@gmail.com");
        values.put("cAddress", "34 Some Road SomeCity");
        values.put("cPhone", "0722019397");
        values.put("cCnp", "xxxx");
        values.put("cIdNumber", "88043535435");
    }

    @Test
    public void create() throws Exception {
        Client client = ClientFactory.getClient(values, 23);
        service.create(client);
        assertEquals(23, client.getcId());
    }

    @Test
    public void read() throws Exception {
        Client readclient = service.read("1");
        assertEquals(23,readclient.getcId());
    }

    @Test
    public void update() throws Exception {
        Client client = service.read("1");
        Client newclient = new Client.Builder()
                .cName(values.get("cName"))
                .cEmail(values.get("cEmail"))
                .cCnp(values.get("cCnp"))
                .cIdNumber(values.get("cIdNumber"))
                .cAddress(values.get("cAddress"))
                .cPhone(values.get("cPhone"))
                .build();
        service.update(newclient);
        Client UpdateClient = service.read("1");
        assertEquals(23, UpdateClient.getcId());
    }

    @Test
    public void delete() throws Exception {
        service.delete("1");
        Client client = service.read("1");
        assertNull(client);
    }

}
*/