package pl.miloszlewandowski.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.miloszlewandowski.entities.Patient;
import pl.miloszlewandowski.repositories.PatientRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//patient = patientRepository.getById(id)
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

    @GetMapping("/patients/{id}")
    public ResponseEntity<Map<String, Patient>> getPatient(@PathVariable("id")Long id){
        Map<String, Patient> map = new HashMap<>();
        map.put("patient", patientRepository.getById(id));
        return ResponseEntity.ok(map);
    }

    @PostMapping("patients")
    public void savePatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

    @PutMapping("patients/{id}")
    public void updatePatient(@RequestBody Patient patient){
        patientRepository.getById(patient.getPatientId());

        patientRepository.save(patient);
    }

    @DeleteMapping("/patients/{id}")
    public void deletePatient(@PathVariable("id") Long id){
        patientRepository.deleteById(id);
    }
}