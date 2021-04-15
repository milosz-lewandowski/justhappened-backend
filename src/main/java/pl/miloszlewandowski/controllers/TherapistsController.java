package pl.miloszlewandowski.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.miloszlewandowski.entities.Patient;
import pl.miloszlewandowski.entities.Therapist;
import pl.miloszlewandowski.repositories.TherapistRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TherapistsController {

    final TherapistRepository therapistRepository;

    public TherapistsController(TherapistRepository therapistRepository) {
        this.therapistRepository = therapistRepository;
    }

    @GetMapping("/therapists")
    public List<Therapist> therapistsList(){
        List<Therapist> therapists = new ArrayList<>(therapistRepository.findAll());
        therapists.forEach(therapist -> therapist.setPatients(null));
        return therapists;
    }
}
