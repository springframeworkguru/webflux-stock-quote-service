package guru.springframework.webfluxstockquoteservice.service;

import guru.springframework.webfluxstockquoteservice.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Created by jt on 10/18/17.
 */
public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}
