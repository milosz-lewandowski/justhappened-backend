package pl.miloszlewandowski.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "threads")
public class PatientsThread  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PatientThreadId;
    private String name;
    @OneToMany
    private List<Record> record;

    public Long getPatientThreadId() {
        return PatientThreadId;
    }

    public void setPatientThreadId(Long patientThreadId) {
        PatientThreadId = patientThreadId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Record> getRecord() {
        return record;
    }

    public void setRecord(List<Record> record) {
        this.record = record;
    }

    public PatientsThread() {
    }
}
