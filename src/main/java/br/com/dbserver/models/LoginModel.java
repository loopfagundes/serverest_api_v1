package br.com.dbserver.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"nome", "email"})
public class LoginModel {
    private String email;
    private String password;

    public LoginModel() {
        email = "test@test.com";
        password = "789456";
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
}