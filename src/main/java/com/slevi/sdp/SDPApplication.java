package com.slevi.sdp;

import com.slevi.sdp.domain.Categoria;
import com.slevi.sdp.domain.Produto;
import com.slevi.sdp.repositories.CategoriaRepository;
import com.slevi.sdp.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SDPApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SDPApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria ctg1 = new Categoria(null, "Canecas");
        Categoria ctg2 = new Categoria(null, "Papelaria");
        Categoria ctg3 = new Categoria(null, "Mousepad");
        Categoria ctg4 = new Categoria(null, "Vestuário");
        Categoria ctg5 = new Categoria(null, "Brindes");

        Produto pdt1 = new Produto(null, "Caneca Branca", 35.00);
        Produto pdt2 = new Produto(null, "Caneca Cromada", 55.00);
        Produto pdt3 = new Produto(null, "Caneca c/ alça de Coração", 45.00);
        Produto pdt4 = new Produto(null, "Agenda 365 dias", 75.00);
        Produto pdt5 = new Produto(null, "Agendamento de Clientes - 200pgs", 70.00);
        Produto pdt6 = new Produto(null, "Planner Anual - 400pgs", 70.00);
        Produto pdt7 = new Produto(null, "Mousepad Personalizado 20x20", 25.00);
        Produto pdt8 = new Produto(null, "Mousepad Personalizado 20x20 - c/ Foto", 35.00);
        Produto pdt9 = new Produto(null, "Camiseta Personalizada c/ Foto (P,M,G)", 45.00);
        Produto pdt10 = new Produto(null, "Camiseta Personalizada c/ Foto (GG,XG,XGG)", 55.00);

        ctg1.getProdutos().addAll(Arrays.asList(pdt1, pdt2, pdt3));
        ctg2.getProdutos().addAll(Arrays.asList(pdt4, pdt5, pdt6));
        ctg3.getProdutos().addAll(Arrays.asList(pdt7, pdt8));
        ctg4.getProdutos().addAll(Arrays.asList(pdt9, pdt10));
        ctg5.getProdutos().addAll(Arrays.asList(pdt1, pdt7));

        pdt1.getCategorias().addAll(Arrays.asList(ctg1, ctg5));
        pdt2.getCategorias().addAll(Arrays.asList(ctg1));
        pdt3.getCategorias().addAll(Arrays.asList(ctg1));
        pdt4.getCategorias().addAll(Arrays.asList(ctg2));
        pdt5.getCategorias().addAll(Arrays.asList(ctg2));
        pdt6.getCategorias().addAll(Arrays.asList(ctg2));
        pdt7.getCategorias().addAll(Arrays.asList(ctg3, ctg5));
        pdt8.getCategorias().addAll(Arrays.asList(ctg3));
        pdt9.getCategorias().addAll(Arrays.asList(ctg4));
        pdt10.getCategorias().addAll(Arrays.asList(ctg4));

        categoriaRepository.saveAll(Arrays.asList(ctg1, ctg2, ctg3, ctg4, ctg5));
        produtoRepository.saveAll(Arrays.asList(pdt1, pdt2, pdt3, pdt4, pdt5, pdt6, pdt7, pdt8, pdt9, pdt10));

    }
}
