package com.pacote.appipet.Model;

import java.io.Serializable;

public class CarrinhoOperacao implements Serializable {

    private String data_hora_carrinho;
    private Integer id_carrinho;
    private Integer id_dono_animal;
    private String tipo_retirada;
    private Number total;

    public String getData_hora_carrinho() {
        return data_hora_carrinho;
    }

    public void setData_hora_carrinho(String data_hora_carrinho) {
        this.data_hora_carrinho = data_hora_carrinho;
    }

    public Integer getId_carrinho() {
        return id_carrinho;
    }

    public void setId_carrinho(Integer id_carrinho) {
        this.id_carrinho = id_carrinho;
    }

    public Integer getId_dono_animal() {
        return id_dono_animal;
    }

    public void setId_dono_animal(Integer id_dono_animal) {
        this.id_dono_animal = id_dono_animal;
    }

    public String getTipo_retirada() {
        return tipo_retirada;
    }

    public void setTipo_retirada(String tipo_retirada) {
        this.tipo_retirada = tipo_retirada;
    }

    public Number getTotal() {
        return total;
    }

    public void setTotal(Number total) {
        this.total = total;
    }
}
