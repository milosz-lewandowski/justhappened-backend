package pl.miloszlewandowski.activities;

import org.springframework.stereotype.Service;
import pl.miloszlewandowski.patients.PatientService;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;
    private final PatientService patientService;

    public ActivityService(ActivityRepository activityRepository, PatientService patientService) {
        this.activityRepository = activityRepository;
        this.patientService = patientService;
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
                patientService.getById(activitySaveR.patientId()));
        activityRepository.save(activity);
    }

    public void deleteById(Integer id) {
        activityRepository.deleteById(id);
    }
}
