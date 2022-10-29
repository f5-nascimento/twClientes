package br.com.nascimento.projetoClinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nascimento.projetoClinica.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    

    


}
