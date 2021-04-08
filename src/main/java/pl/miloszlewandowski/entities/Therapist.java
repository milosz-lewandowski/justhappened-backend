package pl.miloszlewandowski.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "therapists")
public class Therapist {

    //in case of run errors try to set drop-create ddl option

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    private String Specialization;
    @OneToMany(mappedBy = "therapist")
    private List<Patient> patients;

    public Therapist() {
    }

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

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
