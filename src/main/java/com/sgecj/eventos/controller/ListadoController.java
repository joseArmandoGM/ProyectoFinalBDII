/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.controller;

import com.sgecj.eventos.domain.Actividad;
import com.sgecj.eventos.service.ActividadService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


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
    
    /**
     * Retorna una lista de actividades segun el evento
     * @param eventoId
     * @param model
     * @return 
     */
    @RequestMapping("/actividadesPorEvento")
    public String listarActividadesPorEvento(int eventoId, Model model) {
        List<Actividad> actividades = actividadService.buscarPorEvento(eventoId);
        model.addAttribute("actividades", actividades);
        return "listado.html";
    }
    
    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model) {
        List<Actividad> actividades = actividadService.buscar(consulta);
        model.addAttribute("actividades", actividades);
        return "listado.html";
    }
    
    @GetMapping("/actividades")
    @ResponseBody
    public ResponseEntity<List<Actividad>> getActividades(){
        List<Actividad> todos = actividadService.buscarDestacados();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
}
