package pl.miloszlewandowski.therapists;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class TherapistSaveDto {

  String name;
  //  List<Patient> patients;

}
