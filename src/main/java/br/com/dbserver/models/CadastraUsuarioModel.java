package br.com.dbserver.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"nome", "email", "password", "administrador"})
public class CadastraUsuarioModel {
    private String nome;
    private String email;
    private String password;
    private String administrador;

    public CadastraUsuarioModel() {
        nome = "Luciano";
        email = "test@test.com";
        password = "789456";
        administrador = "true";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
}