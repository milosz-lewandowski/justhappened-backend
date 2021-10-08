package pl.miloszlewandowski.patients;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.miloszlewandowski.patients.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

//  List<PatientLabel> getAllPatientLabel();

  PatientDetailsTempProjection getPatientDetailsTempProjectionById(Integer id);
}