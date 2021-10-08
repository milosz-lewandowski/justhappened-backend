package pl.miloszlewandowski.therapists;

import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TherapistMapper {

  Therapist entityFromSaveDto(TherapistSaveDto therapistSaveDto);

  TherapistLabel entityToLabel(Therapist therapist);

  List<TherapistLabel> entitiesToLabels(List<Therapist> therapists);
}
