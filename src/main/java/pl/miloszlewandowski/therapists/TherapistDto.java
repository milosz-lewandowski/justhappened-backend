package pl.miloszlewandowski.therapists;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import pl.miloszlewandowski.patients.Patient;

@Data
@Builder
public class TherapistDto {

  private Integer id;
  private String name;
  private List<Patient> patients;
}
