package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ameer on 2017/08/13.
 */
public class OperationsFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        List<User> userList;
        List<Client> clientList;

        values.put("operationName", "Brock");
        values.put("operationTime", "Date");


    }

    @Test
    public void getOperation() throws Exception {
        Operations operations = OperationsFactory.getOperations(values, "Brock");
        System.out.println(operations.getOperationName());
        assertEquals("Jim", operations.getOperationName());
    }

}