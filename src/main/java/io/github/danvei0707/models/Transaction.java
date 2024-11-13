package io.github.danvei0707.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Foreing key on currencies? =====================================
    private String crypto_name;
    // ================================================================

    private Long crypto_amount;
    private Date acquisition_date;

    private Date created_at; // HOW TO MAKE AUTO-GENERATION

    public Transaction() {
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCryptoName() {
        return crypto_name;
    }

    public void setCryptoName(String cryptoName) {
        this.crypto_name = cryptoName;
    }

    public Long getCrypto_amount() {
        return crypto_amount;
    }

    public void setCryptoAmount(Long crypto_amount) {
        this.crypto_amount = crypto_amount;
    }

    public Date getAcquisitionDate() {
        return acquisition_date;
    }

    public void setAcquisitionDate(Date acquisition_date) {
        this.acquisition_date = acquisition_date;
    }


    public Date getCreatedAt() {
        return created_at;
    }
}
