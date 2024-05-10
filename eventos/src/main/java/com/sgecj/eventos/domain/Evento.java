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
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author huevo
 */
@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "EVT_ID")
    private Integer id;
    @Column (name = "EVT_NOMBRE")
    private String nombre;
    @Column (name = "EVT_FECHA_INICIO")
    private LocalDate fechaInicio;
    @Column (name = "EVT_FECHA_CIERRE")
    private LocalDate fechaCierre;
    @Column (name = "EVT_HORA")
    private LocalTime hora;
    @Column (name = "EVT_LUGAR")
    private String lugar;
    @ManyToOne
    private UnidadAcademica unidadAcademica;

    /**
     * @return the EVT_ID
     */
    public Integer getEVT_ID() {
        return id;
    }

    /**
     * @param EVT_ID the EVT_ID to set
     */
    public void setEVT_ID(Integer EVT_ID) {
        this.id = EVT_ID;
    }

    /**
     * @return the EVT_NOMBRE
     */
    public String getEVT_NOMBRE() {
        return nombre;
    }

    /**
     * @param EVT_NOMBRE the EVT_NOMBRE to set
     */
    public void setEVT_NOMBRE(String EVT_NOMBRE) {
        this.nombre = EVT_NOMBRE;
    }

    /**
     * @return the FECHA_INICIO
     */
    public LocalDate getFECHA_INICIO() {
        return fechaInicio;
    }

    /**
     * @param FECHA_INICIO the FECHA_INICIO to set
     */
    public void setFECHA_INICIO(LocalDate FECHA_INICIO) {
        this.fechaInicio = FECHA_INICIO;
    }

    /**
     * @return the FECHA_CIERRE
     */
    public LocalDate getFECHA_CIERRE() {
        return fechaCierre;
    }

    /**
     * @param FECHA_CIERRE the FECHA_CIERRE to set
     */
    public void setFECHA_CIERRE(LocalDate FECHA_CIERRE) {
        this.fechaCierre = FECHA_CIERRE;
    }

    /**
     * @return the EVT_HORA
     */
    public LocalTime getEVT_HORA() {
        return hora;
    }

    /**
     * @param EVT_HORA the EVT_HORA to set
     */
    public void setEVT_HORA(LocalTime EVT_HORA) {
        this.hora = EVT_HORA;
    }

    /**
     * @return the EVT_LUGAR
     */
    public String getEVT_LUGAR() {
        return lugar;
    }

    /**
     * @param EVT_LUGAR the EVT_LUGAR to set
     */
    public void setEVT_LUGAR(String EVT_LUGAR) {
        this.lugar = EVT_LUGAR;
    }

    /**
     * @return the UnidadAcademica
     */
    public UnidadAcademica getUnidadAcademica() {
        return unidadAcademica;
    }

    /**
     * @param UnidadAcademica the UnidadAcademica to set
     */
    public void setUnidadAcademica(UnidadAcademica UnidadAcademica) {
        this.unidadAcademica = UnidadAcademica;
    }
    
    
    
}
