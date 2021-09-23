package pl.miloszlewandowski.observations;

import javax.persistence.*;
import pl.miloszlewandowski.threads.PatientsThread;

@Entity
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long observationId;
    private String thought;
    private String situation;
    private String effect;
    @ManyToOne
    private PatientsThread thread;

    public Observation() {
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public PatientsThread getThread() {
        return thread;
    }

    public void setThread(PatientsThread thread) {
        this.thread = thread;
    }

    public Long getObservationId() {
        return observationId;
    }

    public void setObservationId(Long observationId) {
        this.observationId = observationId;
    }
}
