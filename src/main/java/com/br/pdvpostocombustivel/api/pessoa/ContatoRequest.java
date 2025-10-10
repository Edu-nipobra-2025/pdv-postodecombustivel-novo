package com.br.pdvpostocombustivel.api.pessoa;

public record ContatoRequest (
    String telefone,
    String email,
    String endereco)
{}
