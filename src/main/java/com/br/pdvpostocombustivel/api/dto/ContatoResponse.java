package com.br.pdvpostocombustivel.api.dto;

public record ContatoResponse (
        String telefone,
        String email,
        String endereco)
{}