package pl.miloszlewandowski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
