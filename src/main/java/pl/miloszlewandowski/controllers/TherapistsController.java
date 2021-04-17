package pl.miloszlewandowski.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.miloszlewandowski.entities.Patient;
import pl.miloszlewandowski.entities.Therapist;
import pl.miloszlewandowski.repositories.TherapistRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TherapistsController {

    final TherapistRepository therapistRepository;

    public TherapistsController(TherapistRepository therapistRepository) {
        this.therapistRepository = therapistRepository;
    }



    @GetMapping("/therapists")
    public Map<String, List<Therapist>> therapistsList(){
        List<Therapist> therapists = new ArrayList<>(therapistRepository.findAll());
        therapists.forEach(therapist -> therapist.setPatients(null));
        Map<String, List<Therapist>> responseNData = new HashMap();
        responseNData.put("therapists", therapists);
        return responseNData;
    }
}
