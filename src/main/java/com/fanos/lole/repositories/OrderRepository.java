/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.repositories;

import com.fanos.lole.domain.LoleOrder;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author btinsae
 */
public interface OrderRepository extends JpaRepository<LoleOrder, Integer>{
    
}
