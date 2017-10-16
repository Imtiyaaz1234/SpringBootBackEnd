package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Employee;
import com.imtiyaaz.tpapppractical.Repository.EmployeeRepository;
import com.imtiyaaz.tpapppractical.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 14 Aug 2017.
 */
public class EmployeeServiceImpl implements EmployeeService{
    /*private static EmployeeServiceImpl service = null;

    EmployeeRepository repo = EmployeeRepositoryImpl.getInstance();

    public static EmployeeServiceImpl getInstance(){
        if(service == null)
            service = new EmployeeServiceImpl();
        return service;
    }

    public Employee create(Employee employee){
        return repo.create(employee);
    }

    public Employee read(String employeeName){
        return repo.read(employeeName);

    }

    public Employee update(Employee employee){
        return repo.update(employee);
    }

    public void delete(String employeeName){
        repo.delete(employeeName);
    }

    */

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee save(Employee entity)
    {
        return repository.save(entity);
    }

    public Employee findById(String s) {
        return null;
    }

    @Override
    public Employee findById(Integer s)
    {
        return repository.findOne(s);
    }

    @Override
    public Employee update(Employee entity)
    {
        return repository.save(entity);
    }

    @Override
    public void delete(Employee entity)
    {
        repository.delete(entity);
    }

}
