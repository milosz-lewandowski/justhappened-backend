package pl.miloszlewandowski.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "therapists")
public class Therapist implements Serializable {

    //in case of run errors try to set drop-create ddl option

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Specialization;

    public Therapist() {
    }
//    public Therapist(String name, String specialization) {
//        Name = name;
//        Specialization = specialization;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Specialization='" + Specialization + '\'' +
                '}';
    }
}
