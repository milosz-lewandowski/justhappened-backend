package pl.miloszlewandowski.therapists;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Builder;
import pl.miloszlewandowski.patients.Patient;

@Entity
@Table(name = "therapists")
@Builder
public class Therapist {

  // in case of run errors try to set drop-create ddl option

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @JoinColumn(name = "therapist_id")
  @OneToMany
  private List<Patient> patients;

  public List<Patient> getPatients() {
    return patients;
  }

  public Therapist() {}

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

}
