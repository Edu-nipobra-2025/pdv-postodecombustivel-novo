package com.br.pdvpostocombustivel.domain.repository;
import com.br.pdvpostocombustivel.domain.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
    Optional<Estoque> findByNome(String Nome);
    Optional<Estoque> FindByCpfCnpj(String cpfCnpj);
    boolean existsByCpfCnpj (String cpfCnpj);
    boolean existsByNome(String nome);
}
