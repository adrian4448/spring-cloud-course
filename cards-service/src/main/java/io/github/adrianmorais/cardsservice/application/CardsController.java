package io.github.adrianmorais.cardsservice.application;

import io.github.adrianmorais.cardsservice.domain.Card;
import io.github.adrianmorais.cardsservice.dto.CardSaveRequest;
import io.github.adrianmorais.cardsservice.dto.CartoesPorClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cartoes")
public class CardsController {

    @Inject
    CardService cardService;

    @Inject
    ClienteCartaoService clienteCartaoService;

    @GetMapping
    public String status() {
        return "Ok";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Card save(@RequestBody CardSaveRequest request) {
        return cardService.save(request.toModel());
    }

    @GetMapping(params = "renda")
    @ResponseStatus(HttpStatus.OK)
    public List<Card> getCartoesRendaMenorIgual(@RequestParam Long renda) {
        return cardService.getCartoesRendaMenorIgual(renda);
    }

    @GetMapping(params = "cpf")
    @ResponseStatus(HttpStatus.OK)
    public List<CartoesPorClienteResponse> getClienteCartaoCpf(@RequestParam String cpf) {
        var listaCartao = clienteCartaoService.listCartoesByCpf(cpf);

        return listaCartao.stream()
                .map(cartao -> CartoesPorClienteResponse.fromModel(cartao))
                .collect(Collectors.toList());
    }

}
