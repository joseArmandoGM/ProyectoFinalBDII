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
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "CAT_ID")
    private Integer id;
    @Column (name = "CAT_NOMBRE")
    private String nombre;

    /**
     * @return the CAT_ID
     */
    public Integer getCAT_ID() {
        return id;
    }

    /**
     * @param CAT_ID the CAT_ID to set
     */
    public void setCAT_ID(Integer CAT_ID) {
        this.id = CAT_ID;
    }

    /**
     * @return the CAT_NOMBRE
     */
    public String getCAT_NOMBRE() {
        return nombre;
    }

    /**
     * @param CAT_NOMBRE the CAT_NOMBRE to set
     */
    public void setCAT_NOMBRE(String CAT_NOMBRE) {
        this.nombre = CAT_NOMBRE;
    }
    
    
    
}
