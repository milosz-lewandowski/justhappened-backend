package pl.miloszlewandowski.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "moodchecks")
public class Moodcheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MoodcheckId;
    @OneToOne
    private Activity activity;
    private Integer mood;
    private Integer selfEsteem;
    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "record_id")
    private Record record;

    public Long getMoodcheckId() {
        return MoodcheckId;
    }

    public void setMoodcheckId(Long moodcheckId) {
        MoodcheckId = moodcheckId;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public Integer getSelfEsteem() {
        return selfEsteem;
    }

    public void setSelfEsteem(Integer selfEsteem) {
        this.selfEsteem = selfEsteem;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Moodcheck() {
    }

}