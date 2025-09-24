package com.br.pdvpostocombustivel.api.dto;
import java.math.BigDecimal;
import javax.xml.crypto.Data;
public record PrecoRequest (
        BigDecimal valor,
        Data dataAlteracao,
        Data horaAlteracao
){
}
