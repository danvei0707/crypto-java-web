package io.github.danvei0707.controllers.api;

import io.github.danvei0707.services.api.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador para ver si la API de CoinGecko está activa
@RestController
@RequestMapping("/api")
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping("/ping")
    public ResponseEntity<String> pingCoinGecko() {
        return ResponseEntity.ok(pingService.ping());
    }
}
