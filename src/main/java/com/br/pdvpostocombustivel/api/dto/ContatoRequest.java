package com.br.pdvpostocombustivel.api.dto;

public record ContatoRequest (
    String telefone,
    String email,
    String endereco)
{}
