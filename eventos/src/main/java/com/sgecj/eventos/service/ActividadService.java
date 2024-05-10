/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.service;

import com.sgecj.eventos.domain.Actividad;
import com.sgecj.eventos.repository.ActividadRepository;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 *
 * @author huevo
 */
@Service
public class ActividadService {
    
    private final ActividadRepository actividadRepository;
    
    public ActividadService(ActividadRepository actividadRepository) {
        this.actividadRepository = actividadRepository;
    }
    
    public List<Actividad> buscarDestacados(){
        
        return actividadRepository.findAll();
        
    }
}
