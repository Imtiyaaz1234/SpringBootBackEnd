/*package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Factories.OperationsFactory;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
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
public class OperationsRepositoryImplTest {
    Map<String, Object> values;
    OperationsRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = OperationsRepositoryImpl.getInstance();

        values = new HashMap<String, Object>();
        values.put("operationName", "Something");
        values.put("operateTime", "Date");
    }

    @Test
    public void create() throws Exception {
        Operations operations = OperationsFactory.getOperations(values, "Something");
        repository.create(operations);
        assertEquals("Something", operations.getOperationName());
    }

    @Test
    public void read() throws Exception {
        Operations readoperations = repository.read("Jim");
        assertEquals("Something", readoperations.getOperationName());
    }

    @Test
    public void update() throws Exception {
        Operations operations = repository.read("Jim");
        Operations newOperations = new Operations.Builder()
                .user((User)values.get("user"))
                .client((Client)values.get("client"))
                .operationName((String)values.get("operationName"))
                .operationTime((Date)values.get("operationTime"))
                .build();
        repository.update(newOperations);
        Operations UpdateOperations = repository.read("Jim");
        assertEquals("Jimmy", UpdateOperations.getOperationName());
    }

    @Test
    public void delete() throws Exception {
        repository.delete("1");
        Operations operations = repository.read("Jim");
        assertNull(operations);
    }

}
*/