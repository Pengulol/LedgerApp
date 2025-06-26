package com.ledger.app;

import org.springframework.boot.SpringApplication;

public class TestLedgerAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(LedgerAppApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
