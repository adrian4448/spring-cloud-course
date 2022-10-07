package io.github.adrianmorais.clientsservice.service;

import io.github.adrianmorais.clientsservice.domain.Client;
import io.github.adrianmorais.clientsservice.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Optional;

@Service
public class ClientService {

    @Inject
    private ClientRepository repository;

    public Optional<Client> findClientByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    @Transactional
    public Client save(Client client) {
        return repository.save(client);
    }

}
