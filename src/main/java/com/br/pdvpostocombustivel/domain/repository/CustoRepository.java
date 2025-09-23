package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Custo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustoRepository extends JpaRepository<Custo, Long>{
    Optional<Custo> findByImposto(String imposto);
    Optional<Custo> findByCustoVariavel(String custoVariavel);
    Optional<Custo> findByCustoFixo(String custoFixo);
    Optional<Custo> findByMargemLucro(String margemLucro);
    Optional<Custo> findByDataProcessamento(String dataProcessamento);

    boolean existsByImposto(String imposto);
    boolean existsByCustoVariavel(String custoVariavel);
    boolean existsByCustoFixo(String custoFixo);
    boolean existsByMargemLucro(String margemLucro);
    boolean existsByDataProcessamento(String dataProcessamento);

}
