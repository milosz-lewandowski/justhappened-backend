package pl.miloszlewandowski.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "moodchecks")
public class Moodcheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;
    @OneToOne
    private Activity activity;
    private Integer mood;
    private Integer selfEsteem;

    public Moodcheck() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
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

    @Override
    public String toString() {
        return "Moodcheck{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", activity=" + activity +
                ", mood=" + mood +
                ", selfEsteem=" + selfEsteem +
                '}';
    }
}