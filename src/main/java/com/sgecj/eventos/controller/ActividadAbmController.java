/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.controller;

import com.sgecj.eventos.domain.Actividad;
import com.sgecj.eventos.service.ActividadService;
import com.sgecj.eventos.service.AreaTematicaService;
import com.sgecj.eventos.service.CategoriaService;
import com.sgecj.eventos.service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huevo
 */
@Controller
public class ActividadAbmController {
    
    private final ActividadService actividadService;
    private final EventoService eventoService;
    private final CategoriaService categoriaService;
    private final AreaTematicaService areaTematicaService;
    
    public ActividadAbmController(ActividadService actividadService,
            EventoService eventoService,
            CategoriaService categoriaService,
            AreaTematicaService areaTematicaService) {
        this.actividadService = actividadService;
        this.eventoService = eventoService;
        this.categoriaService = categoriaService;
        this.areaTematicaService = areaTematicaService;
    }
    
    /**
     * Manda a la pagina para insertar una nueva actividad
     * @param model
     * @return 
     */
    @RequestMapping("/actividades/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("eventos", eventoService.buscarTodos());
        model.addAttribute("categorias", categoriaService.buscarTodos());
        model.addAttribute("areasTematicas", areaTematicaService.buscarTodos());
        model.addAttribute("actividad", new Actividad());
        return "formActividad.html";
    }
    
    /**
     * Guarda una actividad en la base de datos
     * @param actividad
     * @return 
     */
    @PostMapping("/actividades/guardar")
    public String guardar(Actividad actividad) {
        actividadService.guardar(actividad);
        return "redirect:/";
    }
}
