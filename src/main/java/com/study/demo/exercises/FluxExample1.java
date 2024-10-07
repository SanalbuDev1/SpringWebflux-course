package com.study.demo.exercises;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class FluxExample1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Flux<String> nombres =
                Flux.just("Andres", "Pedro", "Juan", "Diego", "Maria", "Julia", "Camila", "Luisa");

        System.out.println("FluxExample1.run ----------------- Exercises 1");
        nombres.doOnNext( elemento -> System.out.println(elemento))
                .subscribe();
        System.out.println("FluxExample1.run ----------------- Exercises 2");
    }
}
