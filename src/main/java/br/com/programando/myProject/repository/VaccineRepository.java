package br.com.programando.myProject.repository;

import br.com.programando.myProject.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository  extends JpaRepository <Vaccine, Long>{
}
