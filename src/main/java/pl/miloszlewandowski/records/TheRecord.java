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
@Inheritance(strategy = InheritanceType.JOINED)
public class TheRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime started;
    private LocalDateTime submitted;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    public Integer getId() {
        return id;
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public void setStarted(LocalDateTime started) {
        this.started = started;
    }

    public LocalDateTime getSubmitted() {
        return submitted;
    }

    public void setSubmitted(LocalDateTime submitted) {
        this.submitted = submitted;
    }

    public void setId(Integer id) {
        this.id = id;
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
