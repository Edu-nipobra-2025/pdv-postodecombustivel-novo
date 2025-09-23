package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import enums.TipoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
   Optional<Pessoa> findByNome(String nome);
   Optional<Pessoa> findByCpfCnpj(String cpfCnpj);
    Optional<Pessoa> findByNumeroCtps(Long numeroCtps);
    Optional<Pessoa> findByDataNascimento(LocalDate dataNascimento);
    Optional<Pessoa> findByTipoPessoa(TipoPessoa tipoPessoa);
    boolean existsByNome(String nome);
    boolean existsByCpfCnpj (String cpfCnpj);
    boolean existsByNumeroCtps (Long numeroCtps);
    boolean existsByDataNascimento(LocalDate dataNascimento);
    boolean existsByTipoPessoa(TipoPessoa tipoPessoa);
}
