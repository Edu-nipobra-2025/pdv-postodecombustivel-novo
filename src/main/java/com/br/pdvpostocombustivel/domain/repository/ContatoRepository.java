package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
    Optional<Contato> findByTelefone(String Telefone);
    Optional<Contato> findByEmail(String Email);
    Optional<Contato> findByEndereço (String Endereço);
    boolean existsByTelefone(String Telefone);
    boolean existsByEmail(String Email);
    boolean existsByEndereço(String Endereço);

}
