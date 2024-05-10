/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.domain;

import jakarta.persistence.Column;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author huevo
 */
@Entity
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACT_ID")
    private int id;
    @Column (name = "ACT_NOMBRE")
    private String nombre;
    @Column (name = "ACT_UBICACION")
    private String ubicacion;
    @Column (name = "ACT_CUPO_PERSONAS")
    private String cupoPersonas;
    @Column (name = "ACT_FECHA_INICIO")
    private LocalDate fechaInicio;
    @Column (name = "ACT_FECHA_FINAL")
    private LocalDate fechaFinal;
    @Column (name = "ACT_HORA_INICIO")
    private LocalTime horaInicio;
    @Column (name = "ACT_DURACION")
    private String duracion;
    @Column (name = "ACT_IMAGENURL")
    private String imagenURL;
    @ManyToOne
    private Evento evento;
    
    
    
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

    /**
     * @return the id
     */
    public int getId() {
        return getACT_ID();
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.setACT_ID(id);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return getACT_NOMBRE();
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.setACT_NOMBRE(nombre);
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return getACT_UBICACION();
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.setACT_UBICACION(ubicacion);
    }

    /**
     * @return the cupoPersonas
     */
    public String getCupoPersonas() {
        return getACT_CUPO_PERSONAS();
    }

    /**
     * @param cupoPersonas the cupoPersonas to set
     */
    public void setCupoPersonas(String cupoPersonas) {
        this.setACT_CUPO_PERSONAS(cupoPersonas);
    }

    /**
     * @return the fechaInicio
     */
    public LocalDate getFechaInicio() {
        return getACT_FECHA_INICIO();
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.setACT_FECHA_INICIO(fechaInicio);
    }

    /**
     * @return the fechaFinal
     */
    public LocalDate getFechaFinal() {
        return getACT_FECHA_FINAL();
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(LocalDate fechaFinal) {
        this.setACT_FECHA_FINAL(fechaFinal);
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return getACT_HORA_INICIO();
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.setACT_HORA_INICIO(horaInicio);
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return getACT_DURACION();
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.setACT_DURACION(duracion);
    }

    /**
     * @return the imagenURL
     */
    public String getImagenURL() {
        return getACT_IMAGENURL();
    }

    /**
     * @param imagenURL the imagenURL to set
     */
    public void setImagenURL(String imagenURL) {
        this.setACT_IMAGENURL(imagenURL);
    }

    /**
     * @return the ACT_ID
     */
    public int getACT_ID() {
        return id;
    }

    /**
     * @param ACT_ID the ACT_ID to set
     */
    public void setACT_ID(int ACT_ID) {
        this.id = ACT_ID;
    }

    /**
     * @return the ACT_NOMBRE
     */
    public String getACT_NOMBRE() {
        return nombre;
    }

    /**
     * @param ACT_NOMBRE the ACT_NOMBRE to set
     */
    public void setACT_NOMBRE(String ACT_NOMBRE) {
        this.nombre = ACT_NOMBRE;
    }

    /**
     * @return the ACT_UBICACION
     */
    public String getACT_UBICACION() {
        return ubicacion;
    }

    /**
     * @param ACT_UBICACION the ACT_UBICACION to set
     */
    public void setACT_UBICACION(String ACT_UBICACION) {
        this.ubicacion = ACT_UBICACION;
    }

    /**
     * @return the ACT_CUPO_PERSONAS
     */
    public String getACT_CUPO_PERSONAS() {
        return cupoPersonas;
    }

    /**
     * @param ACT_CUPO_PERSONAS the ACT_CUPO_PERSONAS to set
     */
    public void setACT_CUPO_PERSONAS(String ACT_CUPO_PERSONAS) {
        this.cupoPersonas = ACT_CUPO_PERSONAS;
    }

    /**
     * @return the ACT_FECHA_INICIO
     */
    public LocalDate getACT_FECHA_INICIO() {
        return fechaInicio;
    }

    /**
     * @param ACT_FECHA_INICIO the ACT_FECHA_INICIO to set
     */
    public void setACT_FECHA_INICIO(LocalDate ACT_FECHA_INICIO) {
        this.fechaInicio = ACT_FECHA_INICIO;
    }

    /**
     * @return the ACT_FECHA_FINAL
     */
    public LocalDate getACT_FECHA_FINAL() {
        return fechaFinal;
    }

    /**
     * @param ACT_FECHA_FINAL the ACT_FECHA_FINAL to set
     */
    public void setACT_FECHA_FINAL(LocalDate ACT_FECHA_FINAL) {
        this.fechaFinal = ACT_FECHA_FINAL;
    }

    /**
     * @return the ACT_HORA_INICIO
     */
    public LocalTime getACT_HORA_INICIO() {
        return horaInicio;
    }

    /**
     * @param ACT_HORA_INICIO the ACT_HORA_INICIO to set
     */
    public void setACT_HORA_INICIO(LocalTime ACT_HORA_INICIO) {
        this.horaInicio = ACT_HORA_INICIO;
    }

    /**
     * @return the ACT_DURACION
     */
    public String getACT_DURACION() {
        return duracion;
    }

    /**
     * @param ACT_DURACION the ACT_DURACION to set
     */
    public void setACT_DURACION(String ACT_DURACION) {
        this.duracion = ACT_DURACION;
    }

    /**
     * @return the ACT_IMAGENURL
     */
    public String getACT_IMAGENURL() {
        return imagenURL;
    }

    /**
     * @param ACT_IMAGENURL the ACT_IMAGENURL to set
     */
    public void setACT_IMAGENURL(String ACT_IMAGENURL) {
        this.imagenURL = ACT_IMAGENURL;
    }

    /**
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
}