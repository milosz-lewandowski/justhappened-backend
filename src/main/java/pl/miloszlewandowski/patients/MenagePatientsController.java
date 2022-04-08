package pl.miloszlewandowski.patients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//patients = patientRepository.getById(id)
@RestController
public class MenagePatientsController {

    final PatientRepository patientRepository;

    public MenagePatientsController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/patients")
    public ResponseEntity<Map<String, List<Patient>>> patientsList(){
        Map<String, List<Patient>> map = new HashMap();
        map.put("patients", patientRepository.findAll());
        return ResponseEntity.ok(map);
    }


    //todo: service
    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id")Integer id){
        return ResponseEntity.ok(patientRepository.getById(id));
    }

    @PostMapping("patients")
    public void savePatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

//    @PutMapping("patients/{id}")
//    public void updatePatient(@RequestBody Patient patient){
    //      ERROR:  request body cannot be null
//        patientRepository.getById(patient.getPatientId());
//
//        patientRepository.save(patient);
//    }

    @DeleteMapping("/patients/{id}")
    public void deletePatient(@PathVariable("id") Integer id){
        patientRepository.deleteById(id);
    }
}