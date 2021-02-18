package br.com.programando.myProject.controller;

import br.com.programando.myProject.dto.VaccineDTO;
import br.com.programando.myProject.model.Vaccine;
import br.com.programando.myProject.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class VaccineController {
    VaccineRepository vaccineRepository;

    @Autowired
    public VaccineController(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid VaccineDTO vaccineDTO) {
        Vaccine vaccine = new Vaccine();
        vaccine.setDados(vaccineDTO.getVaccine(),vaccineDTO.getEmail(), vaccineDTO.getData());
        vaccineRepository.save(vaccine);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
