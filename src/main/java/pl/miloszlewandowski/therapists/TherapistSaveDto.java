package pl.miloszlewandowski.therapists;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import pl.miloszlewandowski.patients.Patient;

@Builder
@Data
public class TherapistSaveDto {

  String name;
  List<Patient> patients;

}
