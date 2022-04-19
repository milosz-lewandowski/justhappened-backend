package pl.miloszlewandowski.necessities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pl.miloszlewandowski.patients.Patient;

import javax.persistence.*;

@Entity
@Table(name = "necessities")
public class Necessity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private Integer fulfillLevel;
  private Integer importance;
  @ManyToOne
  @JsonIgnore
  private Patient patient;

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

  public Integer getFulfillLevel() {
    return fulfillLevel;
  }

  public void setFulfillLevel(Integer fulfillLevel) {
    this.fulfillLevel = fulfillLevel;
  }

  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Necessity() {
  }
}
