package br.com.programando.myProject.controller;

import br.com.programando.myProject.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/users"})

public class UserController {
    private UserRepository repository;

    UserController(UserRepository userRepository) {
        this.repository = userRepository;
    }
    // métodos do CRUD aqui

}

