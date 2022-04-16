package pl.miloszlewandowski.records;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

import lombok.*;
import pl.miloszlewandowski.emotions.Emotion;
import pl.miloszlewandowski.emotions.EmotionsCheck;
import pl.miloszlewandowski.moodchecks.MoodCheck;
import pl.miloszlewandowski.observations.Observation;
import pl.miloszlewandowski.patients.Patient;

@Entity
@Table(name = "records")
public class TheRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public TheRecord() {
    }
}
