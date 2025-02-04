package com.david.clientMicrosservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.david.clientMicrosservice.entity.Client;
import com.david.clientMicrosservice.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;

    public Client create(Client client) {
        return repository.save(client);
    }

    public Client findById(Long id) throws RuntimeException {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Client> findAllClients() {
        return repository.findAll();
    }

    public Client update(Long id, Client client) throws RuntimeException {
        Client c = findById(id);

        c.setName(client.getName());
        c.setNumber(client.getNumber());
        c.setCpf(client.getCpf());

        return repository.save(c);
    }

    public void delete(Long id) throws RuntimeException {
        Client c = findById(id);
        repository.delete(c);
    }

}
