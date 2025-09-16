package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.dto.PessoaResponse;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
   Optional<Pessoa> findByNome(String Nome);
   Optional<Pessoa> FindByCpfCnpj(String cpfCnpj);
boolean existsByCpfCnpj (String cpfCnpj);
boolean existsByNome(String nome);
}
