package pl.miloszlewandowski.patients;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/patients")
public class PatientController {

  private final PatientService patientService;

  public PatientController(PatientService patientService) {
    this.patientService = patientService;
  }

  @GetMapping(path = "/")
  public List<Patient> getAll() {
    return patientService.getAll();
  }

  @GetMapping(path = "/{id}")
  public Patient getPatient(@PathVariable(value = "id") Integer id) {
    return patientService.getById(id);
  }

  @GetMapping(path = "/p/{id}")
  public PatientDetailsTempProjection getPatientDetails(@PathVariable(value = "id") Integer id) {
    return patientService.getDetailsProjectionById(id);
  }

  @PostMapping(path = "/")
  public Patient savePatient(@RequestBody PatientSaveR patientSaveR) {
    return patientService.saveNewPatient(patientSaveR);
  }

  @PutMapping(path = "/{id}")
  public Patient updatePatient(@PathVariable(value = "id") Integer id, @RequestBody Patient patient) {
//      todo: patientDTO
    return patientService.updatePatient(patient);
  }

  @DeleteMapping(path = "/{id}")
  public void deletePatient(@PathVariable(value = "id") Integer id) {
    patientService.deleteById(id);
  }
}
