package com.br.pdvpostocombustivel.api.pessoa.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PessoaResponse(
        Long nomeCompleto,
        String cpfCnpj,
        String numeroCtps,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        Long dataNascimento,
        LocalDate tipoPessoa
) {
}
