package com.br.pdvpostocombustivel.api.pessoa.dto;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record EstoqueRequest(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataValidade,
        BigDecimal quantidade,
String localTanque,
        String localEndereco,
        String LoteFabricacao) {
}
