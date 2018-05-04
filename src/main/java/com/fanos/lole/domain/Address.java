/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fanos.lole.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author win8
 */
@Getter 
@Setter
@Embeddable
public class Address implements Serializable {

  @Column(name = "phone", table = "service_providers", length = 20)
    @Basic
    private String phone;

    @Column(name = "sub_city", table = "service_providers", nullable = false, length = 45)
    @Basic(optional = false)
    private String subCity;

    @Column(name = "woreda", table = "service_providers", nullable = false, length = 45)
    @Basic(optional = false)
    private String woreda;

    @Column(name = "lat", table = "service_providers", nullable = false)
    @Basic(optional = false)
    private double lat;

    @Column(name = "lng", table = "service_providers", nullable = false)
    @Basic(optional = false)
    private double lng;
   

}
