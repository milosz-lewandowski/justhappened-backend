package pl.miloszlewandowski.threads;

import javax.persistence.*;
import java.util.List;
import pl.miloszlewandowski.records.TheRecord;

@Entity
@Table(name = "threads")
public class PatientsThread  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany
    private List<TheRecord> theRecords;

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

    public List<TheRecord> getRecord() {
        return theRecords;
    }

    public void setRecord(List<TheRecord> theRecord) {
        this.theRecords = theRecord;
    }

    public PatientsThread() {
    }
}
