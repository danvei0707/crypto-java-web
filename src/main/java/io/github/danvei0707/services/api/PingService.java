package io.github.danvei0707.services.api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PingService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String ping() {
        String url = "https://api.coingecko.com/api/v3/ping";
        return restTemplate.getForObject(url, String.class);
    }

}
