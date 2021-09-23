package pl.miloszlewandowski.patients;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.patients.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}