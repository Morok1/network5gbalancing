package com.smagin.network5gbalancing.network5gbalancing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@Slf4j
public class SimpleController {
    @MessageMapping("A")
    public Mono<Void> handleRequestFromAZone(String stub) {
        log.info("received: {} at {}", stub, Instant.now());
        return Mono.empty();
    }

    @MessageMapping("B")
    public Mono<Void> handleRequestFromBZone(String stub) {
        log.info("received: {} at {}", stub, Instant.now());
        return Mono.empty();
    }

    @MessageMapping("C")
    public Mono<Void> handleRequestFromCZone(String stub) {
        log.info("received: {} at {}", stub, Instant.now());
        return Mono.empty();
    }

    @MessageMapping("D")
    public Mono<Void> handleRequestFromDZone(String stub) {
        log.info("received: {} at {}", stub, Instant.now());
        return Mono.empty();
    }
}
