package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Custo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustoRepository extends JpaRepository<Custo, Long>{
    Optional<Custo> findByImposto(String imposto);
    Optional<Custo> findBySenha(String Senha);
    Optional<Custo> findBySenha(String Senha);
    Optional<Custo> findBySenha(String Senha);
    Optional<Custo> findBySenha(String Senha);

    boolean existsByImposto(String imposto);
    boolean existsBySenha(String Senha);
    boolean existsBySenha(String Senha);
    boolean existsBySenha(String Senha);
    boolean existsBySenha(String Senha);

}
