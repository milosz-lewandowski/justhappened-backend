package pl.miloszlewandowski.menage_patients;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.patients.Patient;
import pl.miloszlewandowski.patients.PatientRepository;
import pl.miloszlewandowski.therapists.TherapistRepository;

@Service
public class MenagePatientService {

  private final PatientRepository patientRepository;
  private final TherapistRepository therapistRepository;

  public MenagePatientService(PatientRepository patientRepository, TherapistRepository therapistRepository) {
    this.patientRepository = patientRepository;
    this.therapistRepository = therapistRepository;
  }

  public void setPatientsTherapist(SetPatientsTherapist setPatientsTherapist) {
    Patient patient = patientRepository.getById(setPatientsTherapist.patientId());
    patient.setTherapist(therapistRepository.getById(setPatientsTherapist.therapistId()));
    patientRepository.save(patient);
  }


}
