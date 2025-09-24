package com.br.pdvpostocombustivel.api.dto;
import enums.TipoPessoa;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PessoaRequest(
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataNascimento,
        TipoPessoa tipoPessoa)
{ }
