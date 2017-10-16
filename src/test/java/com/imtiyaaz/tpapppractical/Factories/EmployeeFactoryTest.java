package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Employee;
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
public class EmployeeFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();
        List<User> userList;

        values.put("EmployeeCnp", "xxxxx");
        values.put("EmployeeName", "Brock");
        values.put("EmployeeEmail", "Brock@gmail.cpom");
        values.put("EmployeePhone", "54354354");
        values.put("EmployeeAddress", "63 Something something street");


    }

    @Test
    public void getEmployee() throws Exception {
        Employee employee = EmployeeFactory.getEmployee(values, 656565);
        System.out.println(employee.getEmployeeName());
        assertEquals("Jim", employee.getEmployeeName());
    }

}