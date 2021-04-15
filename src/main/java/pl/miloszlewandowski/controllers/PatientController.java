package pl.miloszlewandowski.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import pl.miloszlewandowski.entities.Patient;
import pl.miloszlewandowski.repositories.PatientRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class PatientController {

    final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

//    @GetMapping("/patients")
//    ModelAndView patientsList(){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("patients", patientRepository.findAll());
//        mav.setViewName("patientslist");
//        return mav;
//    }
    @GetMapping("/patients")
    public List<Patient> patientsList(){
        List<Patient> patients = new ArrayList<>();
        patients.addAll(patientRepository.findAll());
        patients.stream().forEach(patient -> patient.setTherapist(null));
        return patients;
    }

}
