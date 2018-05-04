/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.services;


import com.fanos.lole.domain.Laundry;
import com.fanos.lole.repositories.LaundryRepository;
import com.fanos.lole.utils.Crud;
import java.util.List;

/**
 *
 * @author Birhane
 */
public class LaundryOrderService implements Crud<Laundry>{

     LaundryRepository repository;

    @Override
    public Laundry store(Laundry t) {
        return repository.save(t);    }

    @Override
    public Laundry show(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean destroy(Laundry t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Laundry update(Laundry t, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Laundry> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
