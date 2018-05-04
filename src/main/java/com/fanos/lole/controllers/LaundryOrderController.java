/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.controllers;

import com.fanos.lole.domain.Laundry;
import com.fanos.lole.domain.Laundry;
import com.fanos.lole.utils.Crud;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Birhane
 */
public class LaundryOrderController implements Crud<Laundry> {

    @PostMapping("")
    @Override
    public @ResponseBody
    Laundry store(@RequestBody Laundry t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @GetMapping("/{id}")
    @Override
    public @ResponseBody
    Laundry show(@PathVariable("id") int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @DeleteMapping("/{id}")
    @Override
    public boolean destroy(@PathVariable(value = "id")
    T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @PutMapping("/{id}")
    @Override
    public @ResponseBody
    Laundry update(@RequestBody Laundry t, @PathVariable("id") int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @GetMapping("")
    @Override
    public @ResponseBody
    List<Laundry> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
