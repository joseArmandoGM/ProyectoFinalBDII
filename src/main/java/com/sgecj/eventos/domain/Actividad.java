/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author huevo
 */
@Entity
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String ubicacion;
    private String cupoPersonas;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalTime horaInicio;
    private String duracion;
    private String imagenURL;
    
    
    
    public Actividad(String nombre, String ubicacion, String cupoPersonas,
            LocalDate fechaInicio, LocalDate fechaFinal, LocalTime horaInicio,
            String duracion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cupoPersonas = cupoPersonas;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this. horaInicio = horaInicio;
        this.duracion = duracion;
    }
    
    public Actividad(int id, String nombre, String ubicacion, String cupoPersonas,
            LocalDate fechaInicio, LocalDate fechaFinal, LocalTime horaInicio,
            String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cupoPersonas = cupoPersonas;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this. horaInicio = horaInicio;
        this.duracion = duracion;
    }
    
    public Actividad() {
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the cupoPersonas
     */
    public String getCupoPersonas() {
        return cupoPersonas;
    }

    /**
     * @param cupoPersonas the cupoPersonas to set
     */
    public void setCupoPersonas(String cupoPersonas) {
        this.cupoPersonas = cupoPersonas;
    }

    /**
     * @return the fechaInicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the imagenURL
     */
    public String getImagenURL() {
        return imagenURL;
    }

    /**
     * @param imagenURL the imagenURL to set
     */
    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }
}