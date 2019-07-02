package com.pacote.appipet.Model;

import java.io.Serializable;

public class Procedimento implements Serializable {
    private String  dataDoProcedimento;
    private Integer id_animal;
    private Integer id_dono_animal;
    private Integer id_estabelecimento;
    private Integer id_procedimento;
    private String  nome_procedimento;
    private String  procedimento;
    private Number valor_procedimento;

    public String getDataDoProcedimento() {
        return dataDoProcedimento;
    }

    public void setDataDoProcedimento(String dataDoProcedimento) {
        this.dataDoProcedimento = dataDoProcedimento;
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
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

    public Integer getId_procedimento() {
        return id_procedimento;
    }

    public void setId_procedimento(Integer id_procedimento) {
        this.id_procedimento = id_procedimento;
    }

    public String getNome_procedimento() {
        return nome_procedimento;
    }

    public void setNome_procedimento(String nome_procedimento) {
        this.nome_procedimento = nome_procedimento;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Number getValor_procedimento() {
        return valor_procedimento;
    }

    public void setValor_procedimento(Number valor_procedimento) {
        this.valor_procedimento = valor_procedimento;
    }
}

