package com.br.pdvpostocombustivel.domain.entity;
import java.math.BigDecimal;
import java.util.Date;

public class Estoque{
    private BigDecimal quantidade;
    private String localTanque;
    private String localEndereco;
    private String loteFabricacao;
    private String dataValidade;


public Estoque (BigDecimal quantidade, String localEndereco, String loteFabricacao, String dataValidade) {

this.quantidade =quantidade;
this.localTanque =localTanque;
this.localEndereco =localEndereco;
this.loteFabricacao =loteFabricacao;
this.dataValidade =dataValidade;
}

    public BigDecimal getQuantidade(BigDecimal quantidade) {
        return quantidade;
    }
    public void setQuantidade{
    this.quantidade = quantidade;
    }
    public String getLocalTanque(){
    return localTanque;
    }
    public void setLocalTanque{
    this.localTanque = localTanque;
    }
    public String getLocalEndereço(String localEndereco){
  return localEndereco;
    }
    public void setLocalEndereco{
    this.localEndereco = localEndereco;
    }
    public String getLoteFabricacao(String loteFabricacao){
    return loteFabricacao;
    }
    public void setLoteFabricacao{
    this.loteFabricacao = loteFabricacao;
    }
    public String getDataValidade(String dataValidade){
    return dataValidade;
    }
    public void setDataValidade{
    this.dataValidade = dataValidade;
    }
//lembrar modificadores de acesso (private public etc.)
    //um get, um set, um get, um set...
}