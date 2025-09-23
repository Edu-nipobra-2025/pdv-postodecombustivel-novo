package com.br.pdvpostocombustivel.domain.repository;
import com.br.pdvpostocombustivel.domain.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    Optional<Estoque> findByDataValidade(String dataValidade);
    Optional<Estoque> findByQuantidade(String quantidade);
    Optional<Estoque> findByLocalTanque(String localTanque);
    Optional<Estoque> FindByLocalEndereco(String LocalEndereco);
    Optional<Estoque> findByLoteFabricacao(String  loteFabricacao);

    boolean existsByDataValidade(String dataValidade);
    boolean existsByQuantidade(String quantidade);
    boolean existsByLocalTanque(String localTanque);
    boolean existsByLocalEndereco(String LocalEndereco);
    boolean existsByLoteFabricacao(String  loteFabricacao);


}
