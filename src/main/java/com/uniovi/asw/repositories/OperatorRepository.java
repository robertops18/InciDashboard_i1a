package com.uniovi.asw.repositories;

import org.springframework.data.repository.CrudRepository;

import com.uniovi.asw.entities.Operator;

public interface OperatorRepository extends CrudRepository<Operator, Long>{

	Operator findByUsername(String username);
	
}