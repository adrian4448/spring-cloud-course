package io.github.adrianmorais.clientsservice.representate;

import io.github.adrianmorais.clientsservice.domain.Client;
import lombok.Data;

@Data
public class ClientSaveRequest {

    private String cpf;
    private String name;
    private Integer age;

    public Client toModel() {
        return new Client(name, cpf, age);
    }
}
