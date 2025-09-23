package com.br.pdvpostocombustivel.domain.service;

import com.br.pdvpostocombustivel.api.dto.PessoaResponse;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import com.br.pdvpostocombustivel.domain.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PessoaService {
    private final PessoaRepository repository;

    public PessoaService (PessoaRepository){}
//create
    public PessoaResponse create (PessoaRequest req){
        validarUnicidadeCpfCnpj(red.cpfCnpj(), null);
        Pessoa nova = toEntity(req);
        return toResponse(repository.save(nova));
    }
    //read by id
@Transactional(readOnly = true)
    public PessoaResponse getById(Longid){
        Pessoa p = repository.findById{

    }
}
}
