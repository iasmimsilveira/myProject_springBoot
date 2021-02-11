package br.com.programando.myProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @CPF
    private String cpf;
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birth;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setDados(String name, String email, String cpf,LocalDate birth){
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birth = birth;

    }
}

