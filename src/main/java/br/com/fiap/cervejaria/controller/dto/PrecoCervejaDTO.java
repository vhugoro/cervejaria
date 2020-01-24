package br.com.fiap.cervejaria.controller.dto;

import java.math.BigDecimal;

public class PrecoCervejaDTO {
    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    private BigDecimal preco;
}
