package io.github.adrianmorais.clientsservice.controller;

import io.github.adrianmorais.clientsservice.domain.Client;
import io.github.adrianmorais.clientsservice.representate.ClientSaveRequest;
import io.github.adrianmorais.clientsservice.service.ClientService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("clientes")
public class ClientResource {

    @Inject
    ClientService clientService;

    @GetMapping
    public String status() {
        return "ok";
    }

    @PostMapping
    public Client saveClient(@RequestBody ClientSaveRequest clientSaveRequest) {
        return clientService.save(clientSaveRequest.toModel());
    }

    @GetMapping(params = "cpf")
    public Client getClientByCpf(@RequestParam String cpf) {
        return clientService.findClientByCpf(cpf).get();
    }

}
