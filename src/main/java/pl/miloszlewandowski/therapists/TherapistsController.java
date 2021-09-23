package pl.miloszlewandowski.therapists;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.miloszlewandowski.therapists.Therapist;
import pl.miloszlewandowski.patients.PatientRepository;
import pl.miloszlewandowski.therapists.TherapistRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TherapistsController {

    final TherapistRepository therapistRepository;
    final PatientRepository patientRepository;

    public TherapistsController(TherapistRepository therapistRepository, PatientRepository patientRepository) {
        this.therapistRepository = therapistRepository;
        this.patientRepository = patientRepository;
    }

    @GetMapping("/therapists")
    public ResponseEntity<Map<String, List<Therapist>>> therapistsList(){
        List<Therapist> therapists = new ArrayList<>(therapistRepository.findAll());
        Map<String, List<Therapist>> responseNData = new HashMap();
        responseNData.put("therapists", therapists);
        return ResponseEntity.ok(responseNData);
    }

    @GetMapping("/therapists/{id}")
    public ResponseEntity<Map<String, Therapist>> getTherapist(@PathVariable("id")Long id){
        Map<String, Therapist> map = new HashMap<>();
        map.put("therapist", therapistRepository.getById(id));
        return ResponseEntity.ok(map);
    }

    @PostMapping("therapists")
    public void saveTherapist(@RequestBody Therapist therapist){
        therapistRepository.save(therapist);
    }

    @PutMapping("therapists/{id}")
    public void updateTherapist(@RequestBody Therapist therapist){
//        therapistRepository.getById(therapist.getId());
        therapistRepository.save(therapist);
    }

    @DeleteMapping("/therapists/{id}")
    public void deleteTherapist(@PathVariable("id") Long id){
        therapistRepository.deleteById(id);
    }

//    @GetMapping("/therapists/{id}/patients")
//    public ResponseEntity<Map<String, List<Patient>>> getTherapistPatients(
//            @PathVariable("id") Long id){
//        Map<String, List<Patient>> map = new HashMap<>();
//        map.put("patients", patientRepository.getPatientsByTherapistId(id));
//        return ResponseEntity.ok(map);
//    }

}

