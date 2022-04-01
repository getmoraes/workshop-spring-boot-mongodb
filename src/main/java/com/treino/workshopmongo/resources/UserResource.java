package com.treino.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.treino.workshopmongo.domain.User;
import com.treino.workshopmongo.services.UserService;

// o controlador REST acessa o Serviço. E o serviço acessa o repositório.
@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	// também pode ser @GetMapping
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
						// buscando todos usuários do banco de dados
		List<User> list = service.findAll();;
		return ResponseEntity.ok().body(list);
	}
}
