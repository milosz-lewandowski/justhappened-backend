package pl.miloszlewandowski.moodchecks;

import javax.persistence.*;
import pl.miloszlewandowski.activities.Activity;
import pl.miloszlewandowski.records.TheRecord;

@Entity
@Table(name = "moodchecks")
public class MoodCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MoodcheckId;
    @OneToOne
    private Activity activity;
    private Integer mood;
    private Integer selfEsteem;
    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "record_id")
    private TheRecord theRecord;

    public Integer getMoodcheckId() {
        return MoodcheckId;
    }

    public void setMoodcheckId(Integer moodcheckId) {
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

    public TheRecord getRecord() {
        return theRecord;
    }

    public void setRecord(TheRecord theRecord) {
        this.theRecord = theRecord;
    }

    public MoodCheck() {
    }

}