/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgecj.eventos.service;

import com.sgecj.eventos.domain.Categoria;
import com.sgecj.eventos.repository.CategoriaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author huevo
 */
@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    
    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }
}
