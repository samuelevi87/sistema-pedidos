package com.slevi.sdp;

import com.slevi.sdp.domain.*;
import com.slevi.sdp.domain.enums.EstadoPagamento;
import com.slevi.sdp.domain.enums.TipoCliente;
import com.slevi.sdp.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class SDPApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private PagamentoRepository pagamentoRepository;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;


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

        Estado est1 = new Estado(null, "Acre", "AC");
        Estado est2 = new Estado(null, "Alagoas", "AL");
        Estado est3 = new Estado(null, "Amapá", "AP");
        Estado est4 = new Estado(null, "Amazonas", "AM");
        Estado est5 = new Estado(null, "Bahia", "BA");
        Estado est6 = new Estado(null, "Ceará", "CE");
        Estado est7 = new Estado(null, "Distrito Federal", "DF");
        Estado est8 = new Estado(null, "Espírito Santo", "ES");
        Estado est9 = new Estado(null, "Goiás", "GO");
        Estado est10 = new Estado(null, "Maranhão", "MA");
        Estado est11 = new Estado(null, "Mato Grosso", "MT");
        Estado est12 = new Estado(null, "Mato Grosso do Sul", "MS");
        Estado est13 = new Estado(null, "Minas Gerais", "MG");
        Estado est14 = new Estado(null, "Pará", "PA");
        Estado est15 = new Estado(null, "Paraíba", "PB");
        Estado est16 = new Estado(null, "Paraná", "PR");
        Estado est17 = new Estado(null, "Pernambuco", "PE");
        Estado est18 = new Estado(null, "Piauí", "PI");
        Estado est19 = new Estado(null, "Rio de Janeiro", "RJ");
        Estado est20 = new Estado(null, "Rio Grande do Norte", "RN");
        Estado est21 = new Estado(null, "Rio Grande do Sul", "RS");
        Estado est22 = new Estado(null, "Rondônia", "RO");
        Estado est23 = new Estado(null, "Roraima", "RR");
        Estado est24 = new Estado(null, "Santa Catarina", "SC");
        Estado est25 = new Estado(null, "São Paulo", "SP");
        Estado est26 = new Estado(null, "Sergipe", "SE");
        Estado est27 = new Estado(null, "Tocantins", "TO");


        Cidade c1 = new Cidade(null, "BALNEÁRIO CAMBORIÚ", est24);
        Cidade c2 = new Cidade(null, "POMERODE", est24);
        Cidade c3 = new Cidade(null, "BLUMENAU", est24);
        Cidade c4 = new Cidade(null, "BOMBINHAS", est24);
        Cidade c5 = new Cidade(null, "ITAJAÍ", est24);
        Cidade c6 = new Cidade(null, "ITAPEMA", est24);
        Cidade c7 = new Cidade(null, "JOINVILLE", est24);
        Cidade c8 = new Cidade(null, "LAGES", est24);
        Cidade c9 = new Cidade(null, "URUBICI", est24);
        Cidade c10 = new Cidade(null, "URUPEMA", est24);

        Cidade c11 = new Cidade(null, "BELO HORIZONTE", est13);
        Cidade c12 = new Cidade(null, "CONTAGEM", est13);
        Cidade c13 = new Cidade(null, "OURO BRANCO", est13);
        Cidade c14 = new Cidade(null, "OURO FINO", est13);
        Cidade c15 = new Cidade(null, "OURO PRETO", est13);
        Cidade c16 = new Cidade(null, "PATOS DE MINAS", est13);
        Cidade c17 = new Cidade(null, "POÇOS DE CALDAS", est13);
        Cidade c18 = new Cidade(null, "UBERABA", est13);
        Cidade c19 = new Cidade(null, "UBERLÂNDIA", est13);
        Cidade c20 = new Cidade(null, "UNAÍ", est13);


        est24.getCidades().addAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10));
        est13.getCidades().addAll(Arrays.asList(c11,c12,c13,c14,c15,c16,c17,c18,c19,c20));

        estadoRepository.saveAll(Arrays.asList(est1,est2,est3,est4,est5,est6,est7,est8,est9,est10,est11,est12,est13,est14,est15,est16,est17,est18,est19,est20,est21,est22,est23,est24,est25,est26,est27));
        cidadeRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20));

        Cliente cli1 = new Cliente(null, "Samuel Levi", "samuel@levi.com", "123456789-10", TipoCliente.PESSOA_FISICA);
        cli1.getTelefones().addAll(Arrays.asList("27056190664", "27852178069", "3411196074"));
        Endereco end1 = new Endereco(null, "Rua Adamastor", "25", "Casa", "Pitaco", "7073386157", cli1, c3);

        Cliente cli2 = new Cliente(null, "Lacy Lax", "Shurlocke@Drew.uk", "38362686133469", TipoCliente.PESSOA_JURIDICA);
        cli2.getTelefones().addAll(Arrays.asList("24508241097"));
        Endereco end2 = new Endereco(null, "Rua Guilhermina", "254", "Casarão", "Palhoça", "24258828509", cli2, c13);

        Cliente cli3 = new Cliente(null, "Theresita Gravenor", "Theresita@Gravenor.com", "1268613340", TipoCliente.PESSOA_FISICA);
        cli3.getTelefones().addAll(Arrays.asList("31509716230"));
        Endereco end3 = new Endereco(null, "Av Paraguai", "254", "Apto 03", "Vila Industrial", "11597873092", cli3, c9);

        Cliente cli4 = new Cliente(null, "Camey Emmet", "Camey@Emmet.uk", "45678686133469", TipoCliente.PESSOA_JURIDICA);
        cli4.getTelefones().addAll(Arrays.asList("31420549075", "23000041870", "5747268528"));
        Endereco end4 = new Endereco(null, "Travessa do Tranco", "1306", "Gringotes", "Muggles", "5499450896", cli4, c19);


        clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4));
        enderecoRepository.saveAll(Arrays.asList(end1, end2, end3, end4));

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Pedido ped1 = new Pedido(null, data.parse("02/01/2021 10:40"), cli1, end1);
        Pagamento pgto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
        ped1.setPagamento(pgto1);
        Pedido ped2 = new Pedido(null, data.parse("04/01/2021 16:14"), cli1, end1);
        Pagamento pgto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, data.parse("04/02/2021 18:00"), null);
        ped2.setPagamento(pgto2);
        Pedido ped3 = new Pedido(null, data.parse("04/01/2021 16:14"), cli2, end2);
        Pagamento pgto3 = new PagamentoComCartao(null, EstadoPagamento.CANCELADO, ped3, 2);
        ped3.setPagamento(pgto3);

        cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
        cli1.getPedidos().addAll(Arrays.asList(ped3));

        pedidoRepository.saveAll(Arrays.asList(ped1, ped2, ped3));
        pagamentoRepository.saveAll(Arrays.asList(pgto1, pgto2, pgto3));

        ItemPedido itemped1 = new ItemPedido(ped1, pdt1, 10.0, 10, pdt1.getPreco());
        ItemPedido itemped2 = new ItemPedido(ped1, pdt2, 0.0, 2, pdt2.getPreco());

        ItemPedido itemped3 = new ItemPedido(ped2, pdt3, 10.0, 10, pdt3.getPreco());
        ItemPedido itemped4 = new ItemPedido(ped2, pdt1, 10.0, 15, pdt1.getPreco());

        ped1.getItens().addAll(Arrays.asList(itemped1, itemped2));
        ped2.getItens().addAll(Arrays.asList(itemped3, itemped4));

        pdt1.getItens().addAll(Arrays.asList(itemped1, itemped4));
        pdt2.getItens().addAll(Arrays.asList(itemped2));
        pdt3.getItens().addAll(Arrays.asList(itemped3));

        itemPedidoRepository.saveAll(Arrays.asList(itemped1, itemped2, itemped3, itemped4));
    }
}
