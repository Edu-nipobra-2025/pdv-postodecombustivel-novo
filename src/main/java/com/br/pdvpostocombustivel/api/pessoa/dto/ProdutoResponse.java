package com.br.pdvpostocombustivel.api.dto;

public record ProdutoResponse (
        String nome,
        String referencia,
        String fornecedor,
        String categoria,
        String marca)
{}
