package com.slevi.cursomc.resources;

import com.slevi.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria ctg1 = new Categoria(1, "Informática");
        Categoria ctg2 = new Categoria(2, "Escritório");
        List<Categoria> lista = new ArrayList<>();
        lista.add(ctg1);
        lista.add(ctg2);

        return lista;
    }
}
