package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ameer on 2017/08/13.
 */
public class UserFactoryTest {
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, Object>();

        values.put("EmployeeUsername", "Person");
        values.put("EmployeePassword", "Password");
        values.put("role", "boss");



    }

    @Test
    public void getUser() throws Exception {
        User user = UserFactory.getUser(values, 656565);
        System.out.println(user.getEmployeeId());
        assertEquals("Jim", user.getEmployeeId());
    }

}