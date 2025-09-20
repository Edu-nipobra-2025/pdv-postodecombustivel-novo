package com.br.pdvpostocombustivel.api.dto;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record EstoqueResponse(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataValidade,
        BigDecimal quantidade,
        String localTanque,
        String localEndereco,
        String LoteFabricacao) {
}
