/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.repositories;

import com.fanos.lole.domain.Laundry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Birhane
 */
@Repository
public interface LaundryRepository extends JpaRepository<Integer, Laundry>{
    
}
