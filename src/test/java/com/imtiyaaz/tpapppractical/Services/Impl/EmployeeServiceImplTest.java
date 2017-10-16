/*package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Employee;
import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Factories.EmployeeFactory;
import com.imtiyaaz.tpapppractical.Services.EmployeeService;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Ameer on 2017/08/14.
 */
/*
public class EmployeeServiceImplTest {
    EmployeeService service;
    Map<String, Object> values;

    @Test
    public void setUp() throws Exception{
        service = new EmployeeServiceImpl();

        values = new HashMap<String, Object>();
        List<User> userList;

        values.put("EmployeeCnp", "xxxxx");
        values.put("EmployeeName", "Brock");
        values.put("EmployeeEmail", "Brock@gmail.cpom");
        values.put("EmployeePhone", "54354354");
        values.put("EmployeeAddress", "63 Something something street");

    }


    @Test
    public void create() throws Exception {
        Employee employee = EmployeeFactory.getEmployee(values, 25);
        service.create(employee);
        assertEquals(25,employee.getEmployeeNumber());

    }

    @Test
    public void read() throws Exception {
        Employee readperson = service.read("1");
        assertEquals(25,readperson.getEmployeeNumber());
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
        service.delete("1");
        Employee employee = service.read("1");
        assertNull(employee);

    }

}
*/