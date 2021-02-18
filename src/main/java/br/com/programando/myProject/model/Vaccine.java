package br.com.programando.myProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Vaccine {
    @NotBlank
    private String vaccine;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    public String getVaccine() {
        return vaccine;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getData() {
        return data;
    }

    public void setDados(String vaccine, String email, LocalDate data){
        this.vaccine = vaccine;
        this.email = email;
        this.data = data;
    }
}
