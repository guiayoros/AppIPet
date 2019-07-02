package com.pacote.appipet.Model;

import java.io.Serializable;

public class EnderecoDono implements Serializable {
    private Integer cep;
    private String complemento;
    private String endereco;
    private Integer id_dono_animal;
    private Integer id_endereco_dono;
    private Integer numero;
    private String observacao;

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getId_dono_animal() {
        return id_dono_animal;
    }

    public void setId_dono_animal(Integer id_dono_animal) {
        this.id_dono_animal = id_dono_animal;
    }

    public Integer getId_endereco_dono() {
        return id_endereco_dono;
    }

    public void setId_endereco_dono(Integer id_endereco_dono) {
        this.id_endereco_dono = id_endereco_dono;
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
}

