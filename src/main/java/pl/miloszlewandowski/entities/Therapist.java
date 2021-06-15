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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Therapist therapist = (Therapist) o;
        return Objects.equals(id, therapist.id) && Objects.equals(Name, therapist.Name) && Objects.equals(Specialization, therapist.Specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, Specialization);
    }
}
