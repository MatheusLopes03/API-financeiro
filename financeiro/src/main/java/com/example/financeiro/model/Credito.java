package com.example.financeiro.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private LocalDate dataReferencia;
    private LocalDate dataRecebimento;
    private double valorCredito;
    private double valorRecebido;
    private double valorDiferenca;
    private String tipoRecebimento;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataReferencia() {
        return dataReferencia;
    }
    public void setDataReferencia(LocalDate dataReferencia) {
        this.dataReferencia = dataReferencia;
    }
    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }
    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public double getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    public double getValorDiferenca() {
        return valorDiferenca;
    }
    public void setValorDiferenca(double valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }
    public String getTipoRecebimento() {
        return tipoRecebimento;
    }
    public void setTipoRecebimento(String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }
    
    
}
