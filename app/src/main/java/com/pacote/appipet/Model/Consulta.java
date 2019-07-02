package com.pacote.appipet.Model;

import java.io.Serializable;

public class Consulta implements Serializable {

    private String data_consulta;
    private Integer id_animal;
    private Integer id_consulta;
    private Integer id_dono_animal;
    private Integer id_estabelecimento;
    private String motivo_consulta;
    private String tipo_consulta;
    private Number valor_consulta;

    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

    public Integer getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Integer id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Integer getId_dono_animal() {
        return id_dono_animal;
    }

    public void setId_dono_animal(Integer id_dono_animal) {
        this.id_dono_animal = id_dono_animal;
    }

    public Integer getId_estabelecimento() {
        return id_estabelecimento;
    }

    public void setId_estabelecimento(Integer id_estabelecimento) {
        this.id_estabelecimento = id_estabelecimento;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public Number getValor_consulta() {
        return valor_consulta;
    }

    public void setValor_consulta(Number valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
}

