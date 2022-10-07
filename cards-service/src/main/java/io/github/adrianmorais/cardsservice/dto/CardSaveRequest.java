package io.github.adrianmorais.cardsservice.dto;

import io.github.adrianmorais.cardsservice.domain.BandeiraCartao;
import io.github.adrianmorais.cardsservice.domain.Card;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardSaveRequest {
    private String nome;
    private BandeiraCartao bandeiraCartao;
    private BigDecimal renda;
    private BigDecimal limiteBasico;

    public Card toModel() {
        return new Card(nome, bandeiraCartao, renda, limiteBasico);
    }
}
