package pl.miloszlewandowski.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private boolean hasMoodcheck;

    public Moodcheck getMoodcheck() {
        return moodcheck;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setMoodcheck(Moodcheck moodcheck) {
        this.moodcheck = moodcheck;
    }

    @OneToOne
    private Moodcheck moodcheck;

    public Long getRecordId() {
        return RecordId;
    }

    public void setRecordId(Long recordId) {
        RecordId = recordId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isHasMoodcheck() {
        return hasMoodcheck;
    }

    public void setHasMoodcheck(boolean hasMoodcheck) {
        this.hasMoodcheck = hasMoodcheck;
    }

    public Record() {
    }
}
