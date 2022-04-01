package com.treino.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treino.workshopmongo.domain.User;
import com.treino.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	// Mecanismo de injeção de depêndencia automatica do Spring
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
