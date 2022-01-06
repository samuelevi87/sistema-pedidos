package com.slevi.sdp.services;

import com.slevi.sdp.domain.Pedido;
import com.slevi.sdp.repositories.PedidoRepository;
import com.slevi.sdp.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
        @Autowired
        private PedidoRepository repository;

    public Optional<Pedido> findById(Integer id) {
        Optional<Pedido> obj = repository.findById(id);
        return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pedido não encontrada! Id: " + id + ", Tipo: " + Pedido.class.getName())));
    }
}
