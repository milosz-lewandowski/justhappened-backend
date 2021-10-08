package pl.miloszlewandowski.patients;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/patients", consumes = {
    MediaType.APPLICATION_FORM_URLENCODED_VALUE,
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.ALL_VALUE})
public class PatientController {

  private final PatientService patientService;

  public PatientController(PatientService patientService) {
    this.patientService = patientService;
  }

//  @GetMapping(path = "/")
//  public List<PatientLabel> getAll() {
//    return patientService.getAll();
//  }

  @GetMapping(path = "/{id}")
  public PatientDetailsTempProjection getPatient(@PathVariable(value = "id") Integer id) {
    return patientService.getById(id);
  }

  @PostMapping(path = "/")
  public Patient savePatient(@RequestBody Patient patient) {
    //      todo: savePatientDTO
    return patientService.saveNewPatient(patient);
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
