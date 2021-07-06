package pl.miloszlewandowski.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "records")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RecordId;
    @Column(nullable = false, updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;
    private boolean hasMoodCheck;
//    private boolean hasTargetCheck;
    private boolean hasObservation;
    private boolean hasEmotions;
    @OneToOne
    private MoodCheck moodcheck;
//    @OneToOne
//    private TargetCheck targetCheck;
    @OneToOne
    private Observation observation;
    @OneToMany
    private List<Emotion> emotions;

    public Long getRecordId() {
        return RecordId;
    }

    public void setRecordId(Long recordId) {
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

    public boolean isHasMoodCheck() {
        return hasMoodCheck;
    }

    public void setHasMoodCheck(boolean hasMoodCheck) {
        this.hasMoodCheck = hasMoodCheck;
    }

    public boolean isHasObservation() {
        return hasObservation;
    }

    public void setHasObservation(boolean hasObservation) {
        this.hasObservation = hasObservation;
    }

    public boolean isHasEmotions() {
        return hasEmotions;
    }

    public void setHasEmotions(boolean hasEmotions) {
        this.hasEmotions = hasEmotions;
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

    public Record() {
    }
}
