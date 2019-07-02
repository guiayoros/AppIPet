package com.pacote.appipet.Model;

import java.io.Serializable;

public class Estabelecimento implements Serializable {
    private String cnpj;
    private String complemento;
    private String descricao_estabelecimento;
    private String endereco;
    private String hora_abertura;
    private String hora_fechamento;
    private Integer id_estabelecimento;
    private String nome;
    private Integer numero;
    private String observacao;
    private String seguimento;
    private Boolean status_abertura;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDescricao_estabelecimento() {
        return descricao_estabelecimento;
    }

    public void setDescricao_estabelecimento(String descricao_estabelecimento) {
        this.descricao_estabelecimento = descricao_estabelecimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHora_abertura() {
        return hora_abertura;
    }

    public void setHora_abertura(String hora_abertura) {
        this.hora_abertura = hora_abertura;
    }

    public String getHora_fechamento() {
        return hora_fechamento;
    }

    public void setHora_fechamento(String hora_fechamento) {
        this.hora_fechamento = hora_fechamento;
    }

    public Integer getId_estabelecimento() {
        return id_estabelecimento;
    }

    public void setId_estabelecimento(Integer id_estabelecimento) {
        this.id_estabelecimento = id_estabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSeguimento() {
        return seguimento;
    }

    public void setSeguimento(String seguimento) {
        this.seguimento = seguimento;
    }

    public Boolean getStatus_abertura() {
        return status_abertura;
    }

    public void setStatus_abertura(Boolean status_abertura) {
        this.status_abertura = status_abertura;
    }
}

