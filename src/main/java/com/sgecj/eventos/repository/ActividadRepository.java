/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgecj.eventos.repository;

import com.sgecj.eventos.domain.Actividad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author huevo
 */
public interface ActividadRepository extends JpaRepository <Actividad, Integer>{
    
    /**
     * Retorna la lista de actividades por nombre
     * @return
     */
    @Query("Select a from Actividad a order by a.nombre")
    List<Actividad> buscarTodos();
    
    /**
     * Retorna la lista de actividades segun el evento al que pertenece
     */
    @Query("from Actividad a where a.evento.id = ?1 order by a.nombre")
    List<Actividad> buscarPorEvento(int eventoId);
    
    /**
     * Busca las actividades por su nombre
     */
    @Query("from Actividad a where a.nombre like %?1%")
    List<Actividad> buscar(String consulta);
}
