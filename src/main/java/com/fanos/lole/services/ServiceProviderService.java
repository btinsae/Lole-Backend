/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.services;

import com.fanos.lole.domain.ServiceProvider;
import com.fanos.lole.repositories.ServiceProviderRepository;
import com.fanos.lole.utils.Crud;
import java.util.List;

/**
 *
 * @author Birhane
 */
public class ServiceProviderService implements Crud<ServiceProvider> {

    ServiceProviderRepository repository;

    @Override
    public ServiceProvider store(ServiceProvider t) {
        return repository.save(t);
    }

    @Override
    public ServiceProvider show(int id) {
        return repository.getOne(id);
    }

    @Override
    public boolean destroy(ServiceProvider t) {
        repository.delete(t);
        return repository.getOne(t.getServiceProviderId()) != null;
    }

    @Override
    public ServiceProvider update(ServiceProvider t, int id) {
        return repository.save(t);
    }

    @Override
    public List<ServiceProvider> getAll() {
        return repository.findAll();
    }

}
