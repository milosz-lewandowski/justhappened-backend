package pl.miloszlewandowski.therapists;

import javax.persistence.*;
import java.util.List;
import pl.miloszlewandowski.patients.Patient;

@Entity
@Table(name = "therapists")
public class Therapist {

    //in case of run errors try to set drop-create ddl option

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TherapistId;
    private String Name;
    private String Specialization;
    @OneToMany
//    @JoinColumn(name = "patient_id")
    private List<Patient> patient;

    public Therapist() {
    }

    public Long getTherapistId() {
        return TherapistId;
    }

    public void setTherapistId(Long therapistId) {
        TherapistId = therapistId;
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
}
