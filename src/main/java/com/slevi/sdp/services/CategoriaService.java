package com.slevi.sdp.services;

import com.slevi.sdp.domain.Categoria;
import com.slevi.sdp.repositories.CategoriaRepository;

import com.slevi.sdp.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
        @Autowired
        private CategoriaRepository repository;

    public Optional<Categoria> findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException(
                "Categoria não encontrada! Id: " + id + ", Tipo: " + Categoria.class.getName())));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repository.save(obj);
    }
}
