package pl.miloszlewandowski.patients;

import javax.persistence.*;
import java.util.List;
import pl.miloszlewandowski.activities.Activity;
import pl.miloszlewandowski.records.Record;
import pl.miloszlewandowski.therapists.Therapist;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany
    List<Activity> activities;
    @OneToMany
    List<Record> records;
    @ManyToOne
    private Therapist therapist;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer patientId) {
        this.id = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    public Patient() {
    }
}