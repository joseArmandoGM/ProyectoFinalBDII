/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.controller;

import com.sgecj.eventos.domain.Actividad;
import com.sgecj.eventos.domain.Categoria;
import com.sgecj.eventos.service.CategoriaService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author huevo
 */
@Controller
public class CategoriaAbmController {
    
    private final CategoriaService categoriaService;
    
    public CategoriaAbmController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    
    @RequestMapping("/categorias/eliminar")
    public String eliminarCategoriaPorId(@RequestParam("id") String idCategoria) {
        int id = Integer.parseInt(idCategoria);
        categoriaService.eliminarPorId(id);
        return "redirect:/";
    }
    
    /**
     * Mostrar la pagina de edicion de actividades
     *
     * @param idCategoria
     * @param model
     * @return
     */
    @RequestMapping("/categorias/editar")
    public String mostrarEditarCategoria(@RequestParam("id") String idCategoria, Model model) {
        String mensajeError = "";

        try {
            // Intenta convertir el ID del videojuego a un entero
            int id = Integer.parseInt(idCategoria);

            // Busca el videojuego por su ID
            Optional<Categoria> opcionalCategoria = categoriaService.buscarPorId(id);

            if (opcionalCategoria.isPresent()) {
                // Si el videojuego se encuentra, lo agrega al modelo y muestra la vista del videojuego
                Categoria categoria = opcionalCategoria.get();
                model.addAttribute("categoria", categoria);
                // Aquí puedes hacer cualquier procesamiento adicional necesario antes de mostrar la página
                model.addAttribute("categorias", categoriaService.buscarTodos());
                return "formEditarCategoria.html";
            } else {
                // Si el videojuego no se encuentra, muestra una página de error con el mensaje correspondiente
                mensajeError = "Actividad no encontrada";
                model.addAttribute("mensajeError", mensajeError);
                return "error";
            }
        } catch (NumberFormatException e) {
            // Si ocurre una excepción al convertir el ID a entero, muestra una página de error con el mensaje correspondiente
            mensajeError = "Id. de la categoria inválido";
            model.addAttribute("mensajeError", mensajeError);
            return "error";
        }
    }
}
