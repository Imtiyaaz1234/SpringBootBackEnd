package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;
import com.imtiyaaz.tpapppractical.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 14 Aug 2017.
 */
public class ClientServiceImpl implements ClientService {
   /* private static ClientServiceImpl service = null;

    ClientRepository repo = ClientRepositoryImpl.getInstance();

    public static ClientServiceImpl getInstance(){
        if(service == null)
            service = new ClientServiceImpl();
        return service;
    }

    public Client create(Client client){
        return repo.create(client);
    }

    public Client read(String cName){
        return repo.read(cName);

    }

    public Client update(Client client){
        return repo.update(client);
    }

    public void delete(String cName){
        repo.delete(cName);
    }

    */

    @Autowired
    private ClientRepository repository;

    @Override
    public Client save(Client entity)
    {
        return repository.save(entity);
    }

    public Client findById(String s) {
        return null;
    }

    @Override
    public Client findById(Integer s)
    {
        return repository.findOne(s);
    }

    @Override
    public Client update(Client entity)
    {
        return repository.save(entity);
    }

    @Override
    public void delete(Client entity)
    {
        repository.delete(entity);
    }

}
