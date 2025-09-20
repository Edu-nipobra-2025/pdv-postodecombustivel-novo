package com.br.pdvpostocombustivel.api.dto;
import java.math.BigDecimal;
import javax.xml.crypto.Data;
public record PrecoResponse (
        BigDecimal valor,
        Data dataAlteracao,
        Data horaAlteracao
){
}
