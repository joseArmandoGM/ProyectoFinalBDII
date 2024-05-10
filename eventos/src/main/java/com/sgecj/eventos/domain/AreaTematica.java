/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author huevo
 */
@Entity
public class AreaTematica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "AT_ID")
    private Integer id;
    @Column (name = "AT_NOMBRE")
    private String nombre;

    /**
     * @return the AT_ID
     */
    public Integer getAT_ID() {
        return id;
    }

    /**
     * @param AT_ID the AT_ID to set
     */
    public void setAT_ID(Integer AT_ID) {
        this.id = AT_ID;
    }

    /**
     * @return the AT_NOMBRE
     */
    public String getAT_NOMBRE() {
        return nombre;
    }

    /**
     * @param AT_NOMBRE the AT_NOMBRE to set
     */
    public void setAT_NOMBRE(String AT_NOMBRE) {
        this.nombre = AT_NOMBRE;
    }
    
    
    
}
