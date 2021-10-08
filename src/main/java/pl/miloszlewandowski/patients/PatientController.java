package pl.miloszlewandowski.patients;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

  private final PatientService patientService;

  public PatientController(PatientService patientService) {
    this.patientService = patientService;
  }

  @GetMapping("/")
  public List<Patient> getAll() {
    return patientService.getAll();
  }

  // todo: service
  @GetMapping("/{id}")
  public Patient getPatient(@PathVariable("id") Integer id) {
    return patientService.getById(id);
  }

  @PostMapping("/")
  public Patient savePatient(@RequestBody Patient patient) {
    //      todo: savePatientDTO
    return patientService.saveNewPatient(patient);
  }

  @PutMapping("/{id}")
  public Patient updatePatient(@PathVariable("id") Integer id, @RequestBody Patient patient) {
//      todo: patientDTO
    return patientService.updatePatient(patient);
  }

  @DeleteMapping("/{id}")
  public void deletePatient(@PathVariable("id") Integer id) {
    patientService.deleteById(id);
  }
}
