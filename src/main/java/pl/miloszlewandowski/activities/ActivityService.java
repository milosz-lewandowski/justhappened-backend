package pl.miloszlewandowski.activities;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.patients.PatientRepository;
import pl.miloszlewandowski.patients.PatientService;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;
    private final PatientRepository patientRepository;

    public ActivityService(ActivityRepository activityRepository, PatientService patientService, PatientRepository patientRepository) {
        this.activityRepository = activityRepository;
        this.patientRepository = patientRepository;
    }


    public Activity getById(Integer id) {
        return activityRepository.getById(id);
    }

    public List<Activity> getAll() {
        return activityRepository.findAll();
    }


    public void save(ActivitySaveR activitySaveR) {
        Activity activity = new Activity();
        activity.setActivityName(activitySaveR.name());
        activity.setPatient(
                patientRepository.getById(activitySaveR.patientId()));
        activityRepository.save(activity);
    }

    public void deleteById(Integer id) {
        activityRepository.deleteById(id);
    }

    public List<Activity> getAllByPatientId(Integer id) {
        return activityRepository.findByPatient_Id(id);
    }
}
