package io.github.danvei0707;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptoAppServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoAppServerApplication.class, args);

        // Can I populate db here? (fetch coin data)
    }

}