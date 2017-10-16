/*package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Factories.OperationsFactory;
import com.imtiyaaz.tpapppractical.Services.OperationsService;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Ameer on 2017/08/14.
 */
/*
public class OperationsServiceImplTest {
    OperationsService service;
    Map<String, Object> values;
    @Before
    public void setUp() throws Exception {
        service = new OperationsServiceImpl();
        values = new HashMap<String, Object>();
        values.put("operationName", "Something");
        values.put("operateTime", "Date");
    }

    @Test
    public void testCreate() throws Exception {
        Operations operations = OperationsFactory.getOperations(values, "Something");
        service.create(operations);
        assertEquals("Something", operations.getOperationName());
    }

    @Test
    public void testRead() throws Exception {
        Operations readoperations = service.read("Jim");
        assertEquals("Something", readoperations.getOperationName());

    }

    @Test
    public void update() throws Exception {
        Operations operations = service.read("Jim");
        Operations newOperations = new Operations.Builder()
                .user((User)values.get("user"))
                .client((Client)values.get("client"))
                .operationName((String)values.get("operationName"))
                .operationTime((Date)values.get("operationTime"))
                .build();
        service.update(newOperations);
        Operations UpdateOperations = service.read("Jim");
        assertEquals("Jimmy", UpdateOperations.getOperationName());
    }

    @Test
    public void delete() throws Exception {
        service.delete("1");
        Operations operations = service.read("Jim");
        assertNull(operations);

    }

}
*/