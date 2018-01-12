package com.br.apisimples.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.apisimples.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
