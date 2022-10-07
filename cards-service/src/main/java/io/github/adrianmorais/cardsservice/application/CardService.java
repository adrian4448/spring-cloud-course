package io.github.adrianmorais.cardsservice.application;

import io.github.adrianmorais.cardsservice.domain.Card;
import io.github.adrianmorais.cardsservice.repository.CardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@Service
public class CardService {

    @Inject
    private CardRepository repository;

    @Transactional
    public Card save(Card card) {
        return repository.save(card);
    }

    public List<Card> getCartoesRendaMenorIgual(Long renda) {
        return repository.findByRendaLessThanEqual(BigDecimal.valueOf(renda));
    }

}
