package pl.miloszlewandowski.activities;

import javax.persistence.*;
import pl.miloszlewandowski.patients.Patient;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ActivityId;
    private String activityName;
    @ManyToOne
    private Patient patient;

    public Integer getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Integer activityId) {
        ActivityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Activity() {
    }

}
