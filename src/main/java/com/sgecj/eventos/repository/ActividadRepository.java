/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgecj.eventos.repository;

import com.sgecj.eventos.domain.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author huevo
 */
public interface ActividadRepository extends JpaRepository <Actividad, Integer>{
    
}
