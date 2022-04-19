package pl.miloszlewandowski.necessities;

import java.util.List;
import org.springframework.stereotype.Service;
import pl.miloszlewandowski.patients.PatientRepository;

@Service
public class NecessityService {

  private final NecessityRepository necessityRepository;
  private final PatientRepository patientRepository;

  public NecessityService(NecessityRepository necessityRepository,
                          PatientRepository patientRepository) {
    this.necessityRepository = necessityRepository;
    this.patientRepository = patientRepository;
  }

  public List<Necessity> getAll(){
    return necessityRepository.findAll();
  }

  public Necessity getById(Integer id) {
    return necessityRepository.getById(id);
  }

  public List<Necessity> getAllByPatientId(Integer id) {
    return necessityRepository.findByPatient_Id(id);
  }

  public void saveNecessity(SaveNecessityR saveNecessityR) {
    Necessity necessity = new Necessity();
    necessity.setName(saveNecessityR.name());
    necessity.setFulfillLevel(saveNecessityR.fulfillLevel());
    necessity.setPatient(patientRepository.getById(saveNecessityR.patientId()));
    necessityRepository.save(necessity);
  }

  public void delete(Integer id) {
    necessityRepository.deleteById(id);
  }
}
