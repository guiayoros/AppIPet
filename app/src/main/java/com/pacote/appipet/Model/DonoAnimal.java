package com.pacote.appipet.Model;

import java.io.Serializable;

public class DonoAnimal implements Serializable {

    private String email;
    private String nome;
    private String celular;
    private String senha;
    private String cpf;
    private Integer id_dono_animal;
    private String idade;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId_dono_animal() {
        return id_dono_animal;
    }

    public void setId_dono_animal(Integer id_dono_animal) {
        this.id_dono_animal = id_dono_animal;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}