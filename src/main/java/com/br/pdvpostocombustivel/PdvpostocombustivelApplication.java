package com.br.pdvpostocombustivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdvpostocombustivelApplication.class, args);
	Pessoa pessoa1 = new Pessoa();
    pessoa1.setNomeCompleto("Pedro");
    pessoa1.setCpfCnpj("70048865188");
    pessoa1.setDataNascimento ("19800704");
    pessoa1.getNumeroCtps(1223l);

    Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Pedro");
        pessoa2.setCpfCnpj("70048865188");
        pessoa2.setDataNascimento ("19800704");
        pessoa2.getNumeroCtps(1223l);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("Pedro");
        pessoa3.setCpfCnpj("70048865188");
        pessoa3.setDataNascimento ("19800704");
        pessoa3.getNumeroCtps(1223l);
    }
System.out.println("Nome Completo:" + pessoal.getNomeCompleto());
System.out.println("Cpf/Cnpj:" + pessoal.getNomeCompleto());
System.out.println("NumeroCTPs:" + pessoal.getNomeCompleto());
System.out.println("-------------------------------------");

System.out.println("Nome Completo 2:" + pessoal.getNomeCompleto());
System.out.println("Cpf/Cnpj 2:" + pessoal.getNomeCompleto());
System.out.println("NumeroCTPs 2:" + pessoal.getNomeCompleto());
System.out.println("-------------------------------------");
System.out.println("Nome Completo 2:" + pessoal.getNomeCompleto());
System.out.println("Cpf/Cnpj 2:" + pessoal.getNomeCompleto());
System.out.println("NumeroCTPs 2:" + pessoal.getNomeCompleto());
System.out.println("-------------------------------------");
}
