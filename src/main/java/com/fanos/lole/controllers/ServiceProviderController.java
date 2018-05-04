/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.controllers;

import com.fanos.lole.domain.ServiceProvider;
import com.fanos.lole.domain.ServiceProvider;
import com.fanos.lole.utils.Crud;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author win8
 */
@RestController
@RequestMapping("/service-provider")
public class ServiceProviderController implements Crud<ServiceProvider> {
    
    @PostMapping("")
    @Override
    public @ResponseBody
    ServiceProvider store(@RequestBody ServiceProvider t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("/{id}")
    @Override
    public @ResponseBody
    ServiceProvider show(@PathVariable("id") int id) {
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
    ServiceProvider update(@RequestBody ServiceProvider t, @PathVariable("id") int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @GetMapping("")
    @Override
    public @ResponseBody
    List<ServiceProvider> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
