package com.pacote.appipet.Model;

import java.io.Serializable;

public class MeusAgendamentos implements Serializable {

    private Integer id_agendamento;
    private Integer id_animal;
    private Integer id_dono_animal;

    public Integer getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(Integer id_agendamento) {
        this.id_agendamento = id_agendamento;
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
}
