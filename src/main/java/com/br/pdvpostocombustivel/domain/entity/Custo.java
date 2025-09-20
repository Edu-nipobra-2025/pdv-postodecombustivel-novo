package com.br.pdvpostocombustivel.domain.entity;

import java.time.LocalDate;

public class Custo {
    private Double imposto;
    private Double custoVariavel;
    private Double custoFixo;
    private Double margemLucro;
    private LocalDate dataProcessamento;

    public Custo (Double imposto, Double custoVariavel, Double custoFixo, Double margemLucro, LocalDate dataProcessamento){
        this.imposto = imposto;
        this.custoVariavel = custoVariavel;
        this.custoFixo = custoFixo;
        this.margemLucro = margemLucro;
        this.dataProcessamento = dataProcessamento;
    }

    //construtor


    //getter


    //setter

}
