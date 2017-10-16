package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Employee;
import com.imtiyaaz.tpapppractical.Domain.User;

import java.util.Map;

/**
 * Created by Ameer on 2017/08/13.
 */
public class EmployeeFactory {
    public static Employee getEmployee(Map<String, Object> values, int employeeNumber){
        Employee employee = new Employee.Builder()
                .user((User)values.get("user"))
                .employeeCnp((String)values.get("employeeCnp"))
                .employeeNumber(employeeNumber)
                .employeeName((String)values.get("employeeName"))
                .employeeEmail((String)values.get("employeeEmail"))
                .employeeAddress((String)values.get("employeeAddress"))
                .employeePhone((String)values.get("employeePhone"))
                .build();

        return employee;

    }
}
