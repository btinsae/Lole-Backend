/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.services;

import com.fanos.lole.domain.Product;
import com.fanos.lole.repositories.ProductRepository;
import com.fanos.lole.utils.Crud;
import java.util.List;

/**
 *
 * @author Birhane
 */
public class ProductService implements Crud<Product> {

    ProductRepository repository;

    @Override
    public Product store(Product t) {
        return repository.save(t);
    }

    @Override
    public Product show(int id) {
        return repository.getOne(id);
    }

    @Override
    public boolean destroy(Product t) {
        repository.delete(t);
        return repository.getOne(t.getProductId()) != null;
    }

    @Override
    public Product update(Product t, int id) {
        return repository.save(t);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

}
