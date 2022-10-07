package io.github.adrianmorais.cardsservice.application;

import io.github.adrianmorais.cardsservice.domain.ClienteCartao;
import io.github.adrianmorais.cardsservice.repository.ClienteCartaoRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ClienteCartaoService {

    @Inject
    private ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}
