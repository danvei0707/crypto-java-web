package io.github.danvei0707.repositories;

import io.github.danvei0707.models.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CryptoCurrency, Long> {
}