package com.pacote.appipet.Model;

import java.io.Serializable;

public class Produto implements Serializable {
    private String escricao;
    private Boolean disponibilidade;
    private Integer id_estabelecimento;
    private Integer  id_produto;
    private String marca_produto;
    private String nome_produto;
    private Integer porcentagem;
    private Number preco_produto;
    private Boolean promocao;
    private Number quantidade;

    public String getEscricao() {
        return escricao;
    }

    public void setEscricao(String escricao) {
        this.escricao = escricao;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Integer getId_estabelecimento() {
        return id_estabelecimento;
    }

    public void setId_estabelecimento(Integer id_estabelecimento) {
        this.id_estabelecimento = id_estabelecimento;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getMarca_produto() {
        return marca_produto;
    }

    public void setMarca_produto(String marca_produto) {
        this.marca_produto = marca_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Integer getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Integer porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Number getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(Number preco_produto) {
        this.preco_produto = preco_produto;
    }

    public Boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(Boolean promocao) {
        this.promocao = promocao;
    }

    public Number getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Number quantidade) {
        this.quantidade = quantidade;
    }
}

