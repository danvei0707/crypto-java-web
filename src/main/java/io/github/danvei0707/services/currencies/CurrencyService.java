package io.github.danvei0707.services.currencies;

import io.github.danvei0707.models.CryptoCurrency;
import io.github.danvei0707.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<CryptoCurrency> list(){
        return currencyRepository.findAll();
    }
}
