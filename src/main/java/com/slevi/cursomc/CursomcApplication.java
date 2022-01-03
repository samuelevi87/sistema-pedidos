package com.slevi.cursomc;

import com.slevi.cursomc.domain.Categoria;
import com.slevi.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria ctg1 = new Categoria(null, "Canecas");
        Categoria ctg2 = new Categoria(null, "Papelaria");
        Categoria ctg3 = new Categoria(null, "Mousepad");
        Categoria ctg4 = new Categoria(null, "Vestuário");
        Categoria ctg5 = new Categoria(null, "Brindes");

        categoriaRepository.saveAll(Arrays.asList(ctg1, ctg2, ctg3, ctg4, ctg5));
    }
}
