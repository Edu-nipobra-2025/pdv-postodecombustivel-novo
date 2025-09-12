package com.br.pdvpostocombustivel.domain.entity;

public class Acesso{
    private String usuario;
    private String senha;


    //construtor
    public Acesso (String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario{
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}