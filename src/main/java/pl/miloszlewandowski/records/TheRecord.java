package pl.miloszlewandowski.records;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import pl.miloszlewandowski.emotions.Emotion;
import pl.miloszlewandowski.moodchecks.MoodCheck;
import pl.miloszlewandowski.observations.Observation;
import pl.miloszlewandowski.patients.Patient;

@Entity
@Table(name = "records")
public class TheRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RecordId;
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;
    @OneToOne
    private MoodCheck moodcheck;
    @OneToOne
    private Observation observation;
    @OneToMany
    private List<Emotion> emotions;

    public Integer getRecordId() {
        return RecordId;
    }

    public void setRecordId(Integer recordId) {
        RecordId = recordId;
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

    public MoodCheck getMoodcheck() {
        return moodcheck;
    }

    public void setMoodcheck(MoodCheck moodcheck) {
        this.moodcheck = moodcheck;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }

    public List<Emotion> getEmotions() {
        return emotions;
    }

    public void setEmotions(List<Emotion> emotions) {
        this.emotions = emotions;
    }

    public TheRecord() {
    }
}
