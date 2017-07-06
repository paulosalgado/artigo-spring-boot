package com.algaworks.contatos.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.contatos.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {
	
}
