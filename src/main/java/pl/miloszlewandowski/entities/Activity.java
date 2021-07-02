package pl.miloszlewandowski.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ActivityId;
    private String activityName;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long activityId) {
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
