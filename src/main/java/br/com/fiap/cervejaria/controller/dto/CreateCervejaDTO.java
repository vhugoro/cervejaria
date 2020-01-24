package br.com.fiap.cervejaria.controller.dto;

import br.com.fiap.cervejaria.dto.Tipo;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class CreateCervejaDTO {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(Double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public ZonedDateTime getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(ZonedDateTime dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    private Double teorAlcoolico;
    private Tipo tipo;
    private BigDecimal preco;
    private ZonedDateTime dataLancamento;

}

