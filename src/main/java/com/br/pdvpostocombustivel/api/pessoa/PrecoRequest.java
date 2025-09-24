package com.br.pdvpostocombustivel.api.pessoa.dto;
import java.math.BigDecimal;
import javax.xml.crypto.Data;
public record PrecoRequest (
        BigDecimal valor,
        Data dataAlteracao,
        Data horaAlteracao
){
}
