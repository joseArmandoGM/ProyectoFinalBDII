/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.controller;

import com.sgecj.eventos.domain.Actividad;
import com.sgecj.eventos.service.ActividadService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


/**
 *
 * @author huevo
 */
@Controller
public class ListadoController {
    
    private final ActividadService actividadService;
    
    public ListadoController(ActividadService actividadService) {
        this.actividadService = actividadService;
    }
    
    @RequestMapping("/")
    public String listarActividades(Model model) {
        List<Actividad> actividades = actividadService.buscarDestacados();
        
        model.addAttribute("actividades", actividades);
        
        //Busca los eventos
        return "listado.html";
    }
}
