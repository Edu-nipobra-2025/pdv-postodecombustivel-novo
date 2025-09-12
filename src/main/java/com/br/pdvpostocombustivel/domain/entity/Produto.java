package com.br.pdvpostocombustivel.domain.entity;

public class Produto {

    private String nome;
    private String referencia;
    private String fornecedor;
    private String marca;


    public Produto(String nome, String referencia, String fornecedor, String marca){
        this.nome = nome;
        this.referencia = referencia;
        this.fornecedor = fornecedor;
        this.marca = marca;

    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getReferencia(){
        return referencia;
    }
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor() {
        this.fornecedor = fornecedor;

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}
