package pl.miloszlewandowski.patients;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

  private final PatientRepository patientRepository;

  public PatientService(PatientRepository patientRepository) {
    this.patientRepository = patientRepository;
  }

//  public List<PatientLabel> getAll(){
//    return patientRepository.getAllPatientLabel();
//  }


  public PatientDetailsTempProjection getById(Integer id) {
    return patientRepository.getPatientDetailsTempProjectionById(id);
  }

  public Patient saveNewPatient(Patient patient) {
    return patientRepository.save(patient);
  }


  public Patient updatePatient(Patient patient) {
    return null;
  }

  public void deleteById(Integer id) {
    patientRepository.deleteById(id);
  }
}
