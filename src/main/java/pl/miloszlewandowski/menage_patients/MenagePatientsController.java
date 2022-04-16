package pl.miloszlewandowski.menage_patients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.miloszlewandowski.patients.Patient;
import pl.miloszlewandowski.patients.PatientRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//patients = patientRepository.getById(id)
@RestController
@RequestMapping(path = "menage_patients")
public class MenagePatientsController {

    final PatientRepository patientRepository;
    private final MenagePatientService menagePatientService;

    public MenagePatientsController(PatientRepository patientRepository, MenagePatientService menagePatientService) {
        this.patientRepository = patientRepository;
        this.menagePatientService = menagePatientService;
    }

    @GetMapping("/")
    public ResponseEntity<Map<String, List<Patient>>> patientsList(){
        Map<String, List<Patient>> map = new HashMap();
        map.put("patients", patientRepository.findAll());
        return ResponseEntity.ok(map);
    }


    //todo: service
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id")Integer id){
        return ResponseEntity.ok(patientRepository.getById(id));
    }

    @PostMapping("/")
    public void savePatient(@RequestBody Patient patient){
        patientRepository.save(patient);
    }

    @PostMapping(path = "/therapist")
    public void setPatientsTherapist(@RequestBody SetPatientsTherapist setPatientsTherapist){
        menagePatientService.setPatientsTherapist(setPatientsTherapist);
    }


//    @PutMapping("patients/{id}")
//    public void updatePatient(@RequestBody Patient patient){

    //      ERROR:  request body cannot be null
//        patientRepository.getById(patient.getPatientId());
//
//        patientRepository.save(patient);
//    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable("id") Integer id){
        patientRepository.deleteById(id);
    }
}