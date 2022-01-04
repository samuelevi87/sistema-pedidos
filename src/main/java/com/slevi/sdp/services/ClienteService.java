package com.slevi.sdp.services;

import com.slevi.sdp.domain.Cliente;
import com.slevi.sdp.repositories.ClienteRepository;
import com.slevi.sdp.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
        @Autowired
        private ClienteRepository repository;

    public Optional<Cliente> findById(Integer id) {
        Optional<Cliente> obj = repository.findById(id);
        return Optional.ofNullable(obj.orElseThrow(() -> new ObjectNotFoundException(
                "Cliente não encontrada! Id: " + id + ", Tipo: " + Cliente.class.getName())));
    }
}
