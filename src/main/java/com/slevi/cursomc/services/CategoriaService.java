package com.slevi.cursomc.services;

import com.slevi.cursomc.domain.Categoria;
import com.slevi.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
        @Autowired
        private CategoriaRepository repository;

    public Optional<Categoria> findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj;
    }
}
