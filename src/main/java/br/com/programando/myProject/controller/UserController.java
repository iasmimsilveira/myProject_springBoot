package br.com.programando.myProject.controller;

import br.com.programando.myProject.dto.UserDTO;
import br.com.programando.myProject.model.User;
import br.com.programando.myProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")

public class UserController {
    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity <?> createUser(@RequestBody @Valid UserDTO userDTO) {
        User user = new User();
        user.setDados(userDTO.getName(), userDTO.getCpf(), userDTO.getEmail(), userDTO.getBirth());
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

