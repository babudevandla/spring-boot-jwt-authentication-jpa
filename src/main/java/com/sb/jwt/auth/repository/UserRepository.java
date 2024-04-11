package com.sb.jwt.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.sb.jwt.auth.model.Employees;

public interface UserRepository extends CrudRepository<Employees, Integer> {
	Employees findByUsername(String username);
}