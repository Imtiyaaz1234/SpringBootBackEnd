package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Services.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 14 Aug 2017.
 */
public class OperationsServiceImpl implements OperationsService {
    /*private static OperationsServiceImpl service = null;

    OperationsRepository repo = OperationsRepositoryImpl.getInstance();

    public static OperationsServiceImpl getInstance(){
        if(service == null)
            service = new OperationsServiceImpl();
        return service;
    }

    public Operations create(Operations operations){
        return repo.create(operations);
    }

    public Operations read(String operationName){
        return repo.read(operationName);

    }

    public Operations update(Operations operations){
        return repo.update(operations);
    }

    public void delete(String operationName){
        repo.delete(operationName);
    }

    */

    @Autowired
    private OperationsRepository repository;

    @Override
    public Operations save(Operations entity)
    {
        return repository.save(entity);
    }

    @Override
    public Operations findById(String s)
    {
        return repository.findOne(s);
    }

    @Override
    public Operations update(Operations entity)
    {
        return repository.save(entity);
    }

    @Override
    public void delete(Operations entity)
    {
        repository.delete(entity);
    }

}
