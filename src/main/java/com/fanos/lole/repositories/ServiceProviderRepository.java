/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.repositories;

import com.fanos.lole.domain.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author btinsae
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>{
    
}
