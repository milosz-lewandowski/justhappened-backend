package pl.miloszlewandowski.activities;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/activities")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping(path = "/{id}")
    public Activity getById(@PathVariable(value = "id") Integer id){
        return activityService.getById(id);
    }

    @GetMapping(path = "/")
    public List<Activity> getAll(){
        return activityService.getAll();
    }

    @GetMapping(path = "/{patientId}")
    public List<Activity> getByPatientId(@PathVariable(value = "patientId") Integer id){
        return activityService.getAll();
    }

    @PostMapping(path = "/")
    public void saveActivity(@RequestBody ActivitySaveR activitySaveR){
        activityService.save(activitySaveR);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteActivityById(@PathVariable(value = "id") Integer id){
        activityService.deleteById(id);
    }
}
