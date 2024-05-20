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
public interface ActividadRepository extends JpaRepository<Actividad, Integer> {

    /**
     * Retorna la lista de actividades por nombre
     * @return
     */
    @Query("Select a from Actividad a order by a.nombre")
    List<Actividad> buscarTodos();

    /**
     * Retorna la lista de actividades segun el evento al que pertenece
     * @param eventoId
     * @return
     */
    @Query("from Actividad a where a.evento.id = ?1 order by a.nombre")
    List<Actividad> buscarPorEvento(int eventoId);

    /**
     * Retorna la lista de actividades segun el area tematica a la que pertenece
     * @param areaTematicaId
     * @return
     */
    @Query("from Actividad a where a.areaTematica.id = ?1 order by a.nombre")
    List<Actividad> buscarPorAreaTematica(int areaTematicaId);

    /**
     * Retorna la lista de actividades segun la categoria a la que pertenece
     * @param categoriaId
     * @return
     */
    @Query("from Actividad a where a.categoria.id = ?1 order by a.nombre")
    List<Actividad> buscarPorCategoria(int categoriaId);

    /**
     * Busca las actividades por el String de busqueda
     * @param consulta
     * @return
     */
    @Query("from Actividad a where a.nombre like %?1%")
    List<Actividad> buscar(String consulta);
}
