package pl.miloszlewandowski.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "threads")
public class PatientsThread  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PatientThreadId;
    private String name;
    @ManyToOne
    private Record record;

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

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public PatientsThread() {
    }
}
