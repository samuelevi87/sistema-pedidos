package com.slevi.sdp.services;

import com.slevi.sdp.domain.Categoria;
import com.slevi.sdp.dto.CategoriaDTO;
import com.slevi.sdp.repositories.CategoriaRepository;
import com.slevi.sdp.services.exceptions.DataIntegrityException;
import com.slevi.sdp.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Categoria update(Categoria obj) {
        findById(obj.getId());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir uma categoria que tem produtos!");
        }
    }

    public List<Categoria> findAll() {
        return repository.findAll();
    }

    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction),orderBy);
        return repository.findAll(pageRequest);
    }

    public Categoria fromDTO(CategoriaDTO objDto) {
        return new Categoria(objDto.getId(), objDto.getNome());
    }
}
