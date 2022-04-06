package com.treino.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treino.workshopmongo.domain.Post;
import com.treino.workshopmongo.repository.PostRepository;
import com.treino.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	// Mecanismo de injeção de depêndencia automatica do Spring
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
