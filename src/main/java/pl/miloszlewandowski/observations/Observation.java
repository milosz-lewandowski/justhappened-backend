package pl.miloszlewandowski.observations;

import javax.persistence.*;
import pl.miloszlewandowski.threads.PatientsThread;

@Entity
public class Observation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String thought;
    private String situation;
    private String effect;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer observationId) {
        this.id = observationId;
    }
}
