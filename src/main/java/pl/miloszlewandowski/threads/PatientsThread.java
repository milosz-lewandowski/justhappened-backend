package pl.miloszlewandowski.threads;

import javax.persistence.*;
import java.util.List;
import pl.miloszlewandowski.records.Record;

@Entity
@Table(name = "threads")
public class PatientsThread  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany
    private List<Record> record;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
