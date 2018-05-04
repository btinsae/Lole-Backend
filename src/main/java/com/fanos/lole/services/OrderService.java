/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.services;

import com.fanos.lole.domain.LoleOrder;
import com.fanos.lole.domain.LoleOrder;
import com.fanos.lole.repositories.LoleOrderRepository;
import com.fanos.lole.repositories.OrderRepository;
import com.fanos.lole.utils.Crud;
import java.util.List;

/**
 *
 * @author Birhane
 */
public class OrderService implements Crud<LoleOrder> {

    OrderRepository repository;

    @Override
    public LoleOrder store(LoleOrder t) {
        return repository.save(t);
    }

    @Override
    public LoleOrder show(int id) {
        return repository.getOne(id);
    }

    @Override
    public boolean destroy(LoleOrder t) {
        repository.delete(t);
        return repository.getOne(t.getOrderId()) != null;
    }

    @Override
    public LoleOrder update(LoleOrder t, int id) {
        return repository.save(t);
    }

    @Override
    public List<LoleOrder> getAll() {
        return repository.findAll();
    }

}
