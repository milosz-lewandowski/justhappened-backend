package pl.miloszlewandowski.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "threads")
public class PatientsThread implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
