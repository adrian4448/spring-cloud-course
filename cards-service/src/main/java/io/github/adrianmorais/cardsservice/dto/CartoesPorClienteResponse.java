package io.github.adrianmorais.cardsservice.dto;

import io.github.adrianmorais.cardsservice.domain.ClienteCartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartoesPorClienteResponse {

    private String cpf;
    private String bandeira;
    private BigDecimal limiteLiberado;

    public static CartoesPorClienteResponse fromModel(ClienteCartao model) {
        return new CartoesPorClienteResponse(model.getCpf(), model.getCartao().getBandeiraCartao().toString(), model.getLimite());
    }
}
